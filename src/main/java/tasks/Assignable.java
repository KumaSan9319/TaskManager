package tasks;

public interface Assignable extends Manageable {

    // interface that makes manageable tasks assignable to assignees/workers
    void assign(Assignee assignee);
    String getAssignee();

}
