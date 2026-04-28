package org.example.hexlet;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        var app = Javalin.create();

        app.before(ctx -> {
            String id = ctx.queryParam("id");
            if (id == null || id.isEmpty()) {
                ctx.status(400).result("Bad Request: Missing 'id' parameter");
                ctx.skipRemainingHandlers(); // Завершаем обработку
            }
        });

        // Эта мидлвара и обработчики не будет выполнены, если параметр "id" отсутствует
        app.before(ctx -> {
            var path = ctx.path();
            System.out.println("Request path: " + path);
        });

        app.get("/resource", ctx -> {
            String id = ctx.queryParam("id");
            ctx.result("Resource with id: " + id);
        });

        // Другие обработчики

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
