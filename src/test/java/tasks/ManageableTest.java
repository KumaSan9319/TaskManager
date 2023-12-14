package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ManageableTest {

    @Test
    void testIsOverdueMethod() {
        // creating test tasks, one with a due date in the future and one that is already overdue
        Task testTaskA = new Task("Complete Math Homework",
                "Finish the math homework assigned by the teacher.",
                LocalDate.of(2023, 12, 15));
        Task testTaskB = new Task("Buy Groceries",
                "Purchase groceries for the week.",
                LocalDate.of(2023, 12,10));

        // testing the isOverDue() method on both tasks
        Assertions.assertEquals(false, Manageable.isOverdue(testTaskA));
        Assertions.assertEquals(true, Manageable.isOverdue(testTaskB));
    }

}
