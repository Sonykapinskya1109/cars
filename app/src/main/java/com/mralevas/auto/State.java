package com.mralevas.auto;

public class State {

    private String name; // название
    private String model;  // модель
    private int imgResource; // ресурс

    public State(String name, String mod, int img){

        this.name=name;
        this.model =mod;
        this.imgResource =img;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getImgResource() {
        return this.imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
