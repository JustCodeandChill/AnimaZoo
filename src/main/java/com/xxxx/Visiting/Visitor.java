package com.xxxx.Visiting;

public class Visitor {
    private String name;
    private int age;

    public Visitor() {
        this.name = "";
        this.age = 0;
    }

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChildren() {
        return age < 18;
    }

    public boolean isElder() {
        return age > 65;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
