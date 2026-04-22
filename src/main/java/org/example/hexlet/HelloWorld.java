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
        app.start(7070);
    }
}