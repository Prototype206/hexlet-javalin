package org.example.hexlet;

import static io.javalin.rendering.template.TemplateUtil.model;

import java.util.ArrayList;
import java.util.List;

import org.example.hexlet.dto.courses.BuildCoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.users.BuildUserPage;
import org.example.hexlet.model.Course;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.CourseRepository;
import org.example.hexlet.repository.UserRepository;

import io.javalin.Javalin;
import io.javalin.plugin.bundled.DevLoggingPlugin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.registerPlugin(new DevLoggingPlugin());
            config.fileRenderer(new JavalinJte());
            //config.bundledPlugins.enableDevLogging();
        });

//        app.post("/users", ctx -> ctx.result("POST /users"));
//        app.get("/users", ctx -> ctx.result("GET /users"));
//        app.get("/hello", ctx -> {
//            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
//            ctx.result("Hello, " + name + "!");
//        });

//        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
//            var courseId = ctx.pathParam("courseId");
//            var lessonId =  ctx.pathParam("id");
//            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
//        });
        //app.get("/courses/{id}", ctx -> {ctx.result("Course ID: " + ctx.pathParam("id"));});

//        app.get("/users/{id}", ctx -> {ctx.result("User ID: " + ctx.pathParam("id"));});
//        app.get("/users/{id}/post/{postId}", ctx -> {
//            var id = ctx.pathParam("id");
//            var postId = ctx.pathParam("postId");
//            ctx.result("Id = " + id + " + postId = " + postId);
//            });
//        app.get("/", ctx -> ctx.render("index.jte"));

//        Course course0 = new Course(1L, "Dark_magic", "Become a great darkMAN");
//        Course course1 = new Course(2L, "White_magic", "Staying Alive");
//        Course course2 = new Course(3L, "Money_Magic", "Become a blunt money man");
//        Course course3 = new Course(4L, "Starcraft_Magic", "Become great CyberWaflya");
//        Course course4 = new Course(5L, "Java-Developer", "Become a java-developer i guess...");
//        Course course5 = new Course(6L, "Tanks", "Welcome to WarThunder!");
//        List<Course> courses = List.of(course0, course1, course2, course3, course4, course5);

        app.post(NamedRoutes.coursesPath(), ctx -> {
            String name = ctx.formParam("name");
            String description = ctx.formParam("description");
            try {
                name = ctx.formParamAsClass("name", String.class)
                        .check(value -> value.length() > 2, "Имя должно быть длинее 2 символов").get();
                description = ctx.formParamAsClass("description", String.class)
                        .check(value -> value.length() > 10, "Описание должно быть больше 10 символов").get();

                var course = new Course(name, description);
                CourseRepository.save(course);
                ctx.redirect(NamedRoutes.coursesPath());
            } catch (ValidationException e) {
                var page = new BuildCoursePage(name, description, e.getErrors());
                ctx.render("courses/build.jte", model("page", page));
            }
        });

        app.get(NamedRoutes.coursesPath(), ctx -> {
            ctx.render("courses/FileToBeWorking.jte", model("courses", CourseRepository.getEntities()));
        });

        app.get(NamedRoutes.buildCoursePath(), ctx -> {
            var page = new BuildCoursePage();
            ctx.render("courses/build.jte", model("page", page));
        });

        app.get(NamedRoutes.coursePath("{id}"), ctx -> {
            Long courseId = ctx.pathParamAsClass("id", Long.class).get();
            Course page = null;
            for(Course course : CourseRepository.getEntities()) {
                if(course.getId() == courseId) {
                    page = new Course(course.getId(), course.getName(), course.getDescription());
                    break;
                }
            }
            ctx.render("courses/show.jte", model("page", page));
        });

//        app.get("/defence/{id}", ctx -> {
//            var id = ctx.pathParam("id");
//            ctx.contentType("html");
//            //ctx.result("&lth1&gt" + id + "&lt/h1&gt");
//            ctx.render("index.jte", model("id", id));
//        });

//        app.get("/courses", ctx -> {
//            var term = ctx.queryParam("term");
//            var filter = ctx.queryParam("filter");
//            List<Course> coursesWithFilter = new ArrayList<>();
//            if (term != null && !term.isEmpty() || filter != null && !filter.isEmpty()) {
//                for(Course course : courses) {
//                    if(course.getName().toLowerCase().equals(term.toLowerCase()) && !term.isEmpty() || course.getDescription().toLowerCase().contains(filter.toLowerCase()) && !filter.isEmpty()) {
//                        coursesWithFilter.add(course);
//                    }
//                }
//            }
//            else {
//                coursesWithFilter = courses;
//            }
//            var page = new CoursesPage(coursesWithFilter, term, filter);
//            ctx.render("courses/index.jte", model("page", page));
//        });



        app.get(NamedRoutes.buildUserPath(), ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/build.jte", model("page", page));
        });

        app.post(NamedRoutes.usersPath(), ctx -> {
            var name = ctx.formParam("name");
            var email = ctx.formParam("email").trim().toLowerCase();

            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .get();
                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect(NamedRoutes.usersPath());
            } catch (ValidationException e) {
                var page = new BuildUserPage(name, email, e.getErrors());
                ctx.render("users/build.jte", model("page", page));
            }
        });

        app.get(NamedRoutes.usersPath(), ctx -> {
            ctx.render("users/showUsers.jte", model("users", UserRepository.getEntities()));
        });

        app.start(7070);
    }
}