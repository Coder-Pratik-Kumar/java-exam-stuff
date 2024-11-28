import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
}

class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageMarks() {
        if (students.isEmpty()) {
            return 0;
        }

        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks / students.size();
    }

    public Student findTopScorer() {
        if (students.isEmpty()) {
            return null;
        }

        Student topScorer = students.get(0);
        for (Student student : students) {
            if (student.getMarks() > topScorer.getMarks()) {
                topScorer = student;
            }
        }
        return topScorer;
    }
}

public class StudentTopper {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Adding students
        manager.addStudent(new Student(1, "Alice", 95.5));
        manager.addStudent(new Student(2, "Bob", 78.0));
        manager.addStudent(new Student(3, "Charlie", 85.0));
        manager.addStudent(new Student(4, "Diana", 92.0));
        manager.addStudent(new Student(5, "Eve", 74.5));

        // Calculate and display average marks
        double averageMarks = manager.calculateAverageMarks();
        System.out.println("Average Marks: " + averageMarks);

        // Find and display the top scorer
        Student topScorer = manager.findTopScorer();
        if (topScorer != null) {
            System.out.println("Top Scorer: " + topScorer);
        } else {
            System.out.println("No students available.");
        }
    }
}



