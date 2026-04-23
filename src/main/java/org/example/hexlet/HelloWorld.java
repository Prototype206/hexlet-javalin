package org.example.hexlet;

import static io.javalin.rendering.template.TemplateUtil.model;

import java.util.List;

import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import io.javalin.Javalin;
import io.javalin.plugin.bundled.DevLoggingPlugin;
import io.javalin.rendering.template.JavalinJte;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.registerPlugin(new DevLoggingPlugin());
            config.fileRenderer(new JavalinJte());
            //config.bundledPlugins.enableDevLogging();
        });

        app.post("/users", ctx -> ctx.result("POST /users"));
        app.get("/users", ctx -> ctx.result("GET /users"));
        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });
//        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
//            var courseId = ctx.pathParam("courseId");
//            var lessonId =  ctx.pathParam("id");
//            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
//        });
        //app.get("/courses/{id}", ctx -> {ctx.result("Course ID: " + ctx.pathParam("id"));});
        app.get("/users/{id}", ctx -> {ctx.result("User ID: " + ctx.pathParam("id"));});

        app.get("/users/{id}/post/{postId}", ctx -> {
            var id = ctx.pathParam("id");
            var postId = ctx.pathParam("postId");
            ctx.result("Id = " + id + " + postId = " + postId);
            });

        app.get("/", ctx -> ctx.render("index.jte"));
        app.get("/courses/{id}", ctx -> {
            var currentId = ctx.pathParamAsClass("id", Long.class).getOrDefault(-1L);
            Course course = new Course(1L, "Dark_magic", "Become a great darkMAN");
            Course course1 = new Course(2L, "White_magic", "Staying Alive");
            Course course2 = new Course(3L, "Money_Magic", "Become a blunt money man");
            Course course3 = new Course(4L, "Starcraft_Magic", "Become great CyberWaflya");
            Course course4 = new Course(5L, "Java-Developer", "Become a java-developer i guess...");
            List<Course> courses = List.of(course, course1, course2, course3, course4);
            CoursesPage page = new CoursesPage(courses, "A lot of courses here to learn");
            ctx.render("courses/FileToBeWorking.jte", model("page", page));
        });
//
//        app.get("/courses", ctx -> {
//            var courses =
//            var header =
//            var page = new CoursesPage(courses, header);
//            ctx.render("courses/index.jte", model("page", page));
//        });

        app.start(7070);
    }
}