package assignment1.Q9;
import java.util.ArrayList;
import java.util.List;

// Interface for EnrollmentSystem
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollmentDetails();
}

// Student class
class Student {
    private int studentId;
    private String studentName;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;

    // Constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getter methods
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    // Constructor
    public Enrollment() {
        enrolledStudents = new ArrayList<>();
        enrolledCourses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
    }

    // Method to drop a student from a course
    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Student " + student.getStudentName() + " dropped from course " + course.getCourseName());
        } else {
            System.out.println("Student " + student.getStudentName() + " is not enrolled in course " + course.getCourseName());
        }
    }

    // Method to display enrollment details
    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() + ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Alice");
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");
        Enrollment enrollment = new Enrollment();

        // Enroll students in courses
        enrollment.enrollStudent(student1, course1);
        enrollment.enrollStudent(student2, course2);

        // Display enrollment details
        enrollment.displayEnrollmentDetails();

        // Drop a student from a course
        enrollment.dropStudent(student1, course1);

        // Display enrollment details after dropping
        enrollment.displayEnrollmentDetails();
    }
}

