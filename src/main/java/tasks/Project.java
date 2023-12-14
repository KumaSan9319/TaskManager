package tasks;

import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Manageable {

    private String title;
    private String description;
    private LocalDate dueDate;
    private ProjectStatus status;
    private ArrayList<Task> tasks;

    public Project(String title, String description, LocalDate dueDate, ArrayList<Task> tasks) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = ProjectStatus.UPCOMING;
        this.tasks = tasks;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String getStatus() {
        return String.valueOf(status);
    }

    @Override
    public void setStatus(Status status) {
        this.status = (ProjectStatus) status;
    }

    // add tasks to project
    public void addTask(Task task) {
        tasks.add(task);
    }

    // remove tasks from project
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
