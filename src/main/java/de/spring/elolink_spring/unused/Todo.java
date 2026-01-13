package de.spring.elolink_spring.unused;

public class Todo {
    private Long id;
    private String task;
    private boolean done;

    public Todo() {
    }

    public Todo(Long id, String task, boolean done) {
        this.id = id;
        this.done = done;
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
