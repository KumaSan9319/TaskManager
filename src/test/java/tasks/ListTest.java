package tasks;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListTest {

    @Test
    void testListShowMethod() {
        // creating a test array of manageable tasks
        ArrayList<Manageable> manageableTasks = new ArrayList<>();
        manageableTasks.add(new Task("Complete Math Homework",
                "Finish the math homework assigned by the teacher.",
                LocalDate.of(2023, 12, 15)));
        manageableTasks.add(new Task("Buy Groceries",
                "Purchase groceries for the week.",
                LocalDate.of(2023, 12,17)));
        manageableTasks.add(new Task("Clean the House",
                "Clean the house and do laundry.",
                LocalDate.of(2023, 12,20)));

        // checking if the method shows the desired information
        List.show(manageableTasks);

    }

}
