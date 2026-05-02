package org.example.hexlet;

import static io.javalin.rendering.template.TemplateUtil.model;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.time.LocalDate;
import java.util.stream.Collectors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import org.example.hexlet.controller.CarsController;
import org.example.hexlet.controller.PagesController;
import org.example.hexlet.controller.SessionsController;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.repository.BaseRepository;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
           Javalin app = getApp();
           app.start(7070);
    }
    public static Javalin getApp() throws Exception{
        var hikariConfig = new HikariConfig();

        String dbUrl = System.getenv().getOrDefault("JDBC_DATABASE_URL", "jdbc:h2:mem:hexlet_project;DB_CLOSE_DELAY=-1;");

        hikariConfig.setJdbcUrl(dbUrl);

        var dataSource = new HikariDataSource(hikariConfig);

        var url = HelloWorld.class.getClassLoader().getResourceAsStream("schema.sql");
        String sql = new BufferedReader(new InputStreamReader(url))
                .lines().collect(Collectors.joining("\n"));
        try (var connection = dataSource.getConnection();
                var statement = connection.createStatement()) {
            statement.execute(sql);
        }
        BaseRepository.dataSource = dataSource;

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

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

        app.before(ctx -> {
                System.out.println("Today is: " + LocalDate.now());
            });

        app.get(NamedRoutes.usersPath(), ctx -> UsersController.index(ctx));
        app.get(NamedRoutes.buildUserPath(), ctx -> UsersController.build(ctx));
        app.get(NamedRoutes.userPath("{id}"), ctx -> UsersController.show(ctx));
        app.post(NamedRoutes.usersPath(), ctx -> UsersController.create(ctx));
        app.get(NamedRoutes.editUserPath("{id}"), ctx -> UsersController.edit(ctx));
        app.patch(NamedRoutes.userPath("{id}"), ctx -> UsersController.update(ctx));
        app.delete(NamedRoutes.userPath("{id}"), ctx -> UsersController.destroy(ctx));

        app.get(NamedRoutes.carsPath(), ctx -> CarsController.index(ctx));
        app.get(NamedRoutes.buildCarPath(), cxt -> CarsController.build(cxt));
        app.get(NamedRoutes.carPath("{id}"), ctx -> CarsController.show(ctx));
        app.post(NamedRoutes.carsPath(), ctx -> CarsController.create(ctx));
        return app;
    }
}