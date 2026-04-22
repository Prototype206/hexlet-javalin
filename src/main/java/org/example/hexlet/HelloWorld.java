package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.plugin.bundled.DevLoggingPlugin;


public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.registerPlugin(new DevLoggingPlugin());
            //config.bundledPlugins.enableDevLogging();
        });

        app.post("/users", ctx -> ctx.result("POST /users"));
        app.get("/users", ctx -> ctx.result("GET /users"));
        app.get("/hello", ctx -> {
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("World");
            ctx.result("Hello, " + name + "!");
        });
        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
            var courseId = ctx.pathParam("courseId");
            var lessonId =  ctx.pathParam("id");
            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
        });
        app.get("/courses/{id}", ctx -> {ctx.result("Course ID: " + ctx.pathParam("id"));});
        app.get("/users/{id}", ctx -> {ctx.result("User ID: " + ctx.pathParam("id"));});

        app.get("/users/{id}/post/{postId}", ctx -> {
            var id = ctx.pathParam("id");
            var postId = ctx.pathParam("postId");
            ctx.result("Id = " + id + " + postId = " + postId);
            });

        app.start(7070);
    }
}