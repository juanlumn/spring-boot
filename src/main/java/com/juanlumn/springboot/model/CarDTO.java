package com.juanlumn.springboot.model;

public class CarDTO {
    private long id;
    private String model;
    private String color;

    public CarDTO(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CarDTO{" + "id=" + id + ", model='" + model + '\'' + ", color='" + color + '\'' + '}';
    }
}
