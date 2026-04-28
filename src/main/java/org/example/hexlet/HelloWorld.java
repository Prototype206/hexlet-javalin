package org.example.hexlet;

import static io.javalin.rendering.template.TemplateUtil.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.example.hexlet.controller.PagesController;
import org.example.hexlet.controller.SessionsController;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.dto.MainPage;
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


        app.get(NamedRoutes.coursesPath(), ctx -> PagesController.index(ctx));
        app.get(NamedRoutes.buildCoursePath(), ctx -> PagesController.build(ctx));
        app.get(NamedRoutes.coursePath("{id}"), ctx -> PagesController.show(ctx));
        app.post(NamedRoutes.coursesPath(), ctx -> PagesController.create(ctx));
        app.get(NamedRoutes.editCoursePath("{id}"), ctx -> PagesController.edit(ctx));
        app.patch(NamedRoutes.coursePath("{id}"), ctx -> PagesController.update(ctx));
        app.delete(NamedRoutes.coursePath("{id}"), ctx -> PagesController.destroy(ctx));

        app.get("/", ctx -> SessionsController.index(ctx));
        app.post("/sessions", ctx -> SessionsController.create(ctx));
        app.get("/sessions/build", ctx -> SessionsController.build(ctx));
        app.delete("/sessions", ctx -> SessionsController.destroy(ctx));

        //Cookie test
//        app.get("/", ctx -> {
//            var visited = Boolean.valueOf(ctx.cookie("visited"));
//            var page = new MainPage(visited);
//            ctx.render("index.jte", model("page", page));
//            ctx.cookie("visited", String.valueOf(true));
//        });

        app.before(ctx -> {
                System.out.println("Today is: " + LocalDate.now());
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

        app.get(NamedRoutes.usersPath(), ctx -> UsersController.index(ctx));
        app.get(NamedRoutes.buildUserPath(), ctx -> UsersController.build(ctx));
        app.get(NamedRoutes.userPath("{id}"), ctx -> UsersController.show(ctx));
        app.post(NamedRoutes.usersPath(), ctx -> UsersController.create(ctx));
        app.get(NamedRoutes.editUserPath("{id}"), ctx -> UsersController.edit(ctx));
        app.patch(NamedRoutes.userPath("{id}"), ctx -> UsersController.update(ctx));
        app.delete(NamedRoutes.userPath("{id}"), ctx -> UsersController.destroy(ctx));


        app.start(7070);
    }
}