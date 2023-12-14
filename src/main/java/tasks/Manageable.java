package tasks;

import java.time.LocalDate;

public interface Manageable {

    // method that checks wether a task is overdue
    static boolean isOverdue(Manageable manageable) {
        return manageable.getDueDate().isBefore(LocalDate.now());
    }

    String getTitle();
    String getDescription();
    LocalDate getDueDate();
    String getStatus();
    void setStatus(Status status);

}
