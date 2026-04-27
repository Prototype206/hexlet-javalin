package org.example.hexlet.dto.users;

import java.util.List;
import java.util.Map;

import io.javalin.validation.ValidationError;

public class BuildUserPage {
    private String name;
    private String email;
    private String password;
    private Map<String, List<ValidationError<Object>>> errors;

    public BuildUserPage() {}

    public BuildUserPage(String name, String email, String password, Map<String, List<ValidationError<Object>>> errors) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.errors = errors;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, List<ValidationError<Object>>> getErrors(){
        return errors;
    }
}