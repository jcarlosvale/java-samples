package com.study.exercises;

public class Actor {

    private int index;
    private int year;
    private int age;
    private String name;
    private String movie;

    public Actor() {}

    public Actor(int index, int year, int age, String name, String movie) {
        this.index = index;
        this.year = year;
        this.age = age;
        this.name = name;
        this.movie = movie;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "index=" + index +
                ", year=" + year +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", movie='" + movie + '\'' +
                '}';
    }
}