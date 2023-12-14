package tasks;

import java.time.LocalDate;

public class Task implements Manageable, Assignable {

    private String title;
    private String description;
    private LocalDate dueDate;
    private Assignee assignee;
    private TaskStatus status;

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = TaskStatus.OPEN;
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
        this.status = (TaskStatus) status;
    }

    // assigning task to a person
    @Override
    public void assign(Assignee assignee) {
        this.assignee = assignee;
    }

    @Override
    public String getAssignee() {
        return String.valueOf(assignee);
    }
}
