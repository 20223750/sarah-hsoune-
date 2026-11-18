
public class Student {

    // Attributes
    private int studentId;
    private String name;
    private String email;
    private int age;

    // Constructor
    public Student(int studentId, String name, String email, int age) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
}
