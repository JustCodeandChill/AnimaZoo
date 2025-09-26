package com.xxxx.Housing.LivingEnvironment;

public class Habitat {
    private String name;
    private HabitatType type;

    public Habitat(String name, HabitatType type) {
        this.name = name;
        this.type = type;
    }

    public Habitat() {
        this.name = "Not assigned";
        this.type = HabitatType.UNDEFINED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HabitatType getType() {
        return type;
    }

    public void setType(HabitatType type) {
        this.type = type;
    }
}
