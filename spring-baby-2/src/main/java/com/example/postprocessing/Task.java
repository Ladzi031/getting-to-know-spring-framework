package com.example.postprocessing;
public class Task {
    private String name;
    private String id;

    public Task() {
    }

    public Task(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void init() {
        System.out.println("about to start the task");
    }

    public void carryOutTask() {
        System.out.println("carrying out task for: "+this.name);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
