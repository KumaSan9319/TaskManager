package tasks;

import java.util.ArrayList;

public class List {

    public static void show(ArrayList<Manageable> managables) {
        for (Manageable task : managables) {
            System.out.println("Task name: " + task.getTitle());
            System.out.println("Task status: " + task.getStatus());
            System.out.println();
        }
    }

}
