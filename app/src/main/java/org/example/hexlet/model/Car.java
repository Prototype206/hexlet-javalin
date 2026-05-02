package org.example.hexlet.model;

public class Car {
    private Long id;
    private String make;
    private String model;

    public Car(Long id, String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Long getId() {
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
