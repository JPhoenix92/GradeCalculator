import model.Student;
import static util.GradeCalculator.calculateGrade;


public class Main {
    public static void main(String[] args) {
        // creating a student object
        Student student1 = new Student("Jewel", 99);

        //calculating grade
        String grade = calculateGrade(student1);

        //displaying result
        System.out.println("Student: " + student1.getName());

        System.out.println("Marks: " + student1.getMarks());

        System.out.println("Grade: " + grade);
    }
}