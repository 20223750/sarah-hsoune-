
public class Main {
    public static void main(String[] args) {

        // Create a student object
        Student student1 = new Student(
            101,
            "John Smith",
            "john@example.com",
            21
        );

        // Display student information
        student1.displayInfo();

        // Update student information
        student1.setAge(22);

        System.out.println("\nUpdated Information:");
        student1.displayInfo();
    }
}
