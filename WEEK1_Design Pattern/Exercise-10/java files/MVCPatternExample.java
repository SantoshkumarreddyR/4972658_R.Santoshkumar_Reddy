public class MVCPatternExample {
    public static void main(String[] args) {
        // Fetch student record based on studentId from the database (simulated here)
        Student model = retrieveStudentFromDatabase();

        // Create a view : to display student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        // Display the initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("John Doe");
        controller.setStudentGrade("A");

        // Display the updated student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Jane Doe");
        student.setId("12345");
        student.setGrade("B");
        return student;
    }
}
