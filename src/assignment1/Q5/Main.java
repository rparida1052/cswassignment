package assignment1.Q5;

// College class
class College {
    private String collegeName;
    private String collegeLoc;

    // Constructor
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    // Getter method for college name
    public String getCollegeName() {
        return collegeName;
    }

    // Getter method for college location
    public String getCollegeLoc() {
        return collegeLoc;
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private College college;

    // Constructor
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Instantiate at least two College objects
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        // Instantiate at least two Student objects
        Student student1 = new Student(101, "John", college1);
        Student student2 = new Student(102, "Alice", college2);

        // Display information of all colleges
        System.out.println("College Information:");
        System.out.println("College 1 Name: " + college1.getCollegeName() + ", Location: " + college1.getCollegeLoc());
        System.out.println("College 2 Name: " + college2.getCollegeName() + ", Location: " + college2.getCollegeLoc());

        // Enroll each student in one of the colleges
        System.out.println("\nEnrolled Students Information:");
        System.out.println("Student 1:");
        student1.displayStudentInfo();
        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}

