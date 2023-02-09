package org.example;

public class Task {
    private final int id;

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

   

    public String getName() {
        return name;
    }

   

    public Task(int id, boolean isCompleted, String name) {
        this.id = id;
        this.isCompleted = isCompleted;
        this.name = name;
    }
   

    private final boolean isCompleted;


    private final String name;

    public String format() {
        return id+" "+name;
    }
}
