package Model;

// Task.java
public class Task {
    private String title;
    private String description;
    private boolean completed;
    private User assignedUser;
    private Proyect project;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void assignUser(User user) {
        this.assignedUser = user;
    }

    public void assignProject(Proyect project) {
        this.project = project;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public Proyect getProject() {
        return project;
    }

    public String title() {
        return title;
    }

    public Task setTitle(String title) {
        this.title = title;
        return this;
    }

    public String description() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean completed() {
        return completed;
    }

    public Task setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}
