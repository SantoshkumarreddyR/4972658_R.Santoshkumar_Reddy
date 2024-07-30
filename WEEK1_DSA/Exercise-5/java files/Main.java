public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Add tasks
        tms.addTask(new Task("T001", "Design System Architecture", "In Progress"));
        tms.addTask(new Task("T002", "Develop Login Module", "Pending"));
        tms.addTask(new Task("T003", "Test Payment Gateway", "Completed"));

        // Traverse tasks
        System.out.println("All Tasks:");
        tms.traverseTasks();

        // Search for a task
        System.out.println("\nSearch for Task T002:");
        Task task = tms.searchTask("T002");
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting Task T002:");
        tms.deleteTask("T002");
        tms.traverseTasks();
    }
}
