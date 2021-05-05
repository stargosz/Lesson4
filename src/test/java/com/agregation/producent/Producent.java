package com.agregation.producent;

public class Producent{

    private String model;
    private String type;

    @Override
    public String toString() {
        return "Producent{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() { return model; }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
