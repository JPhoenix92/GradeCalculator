package util;
import model.Student;

public class GradeCalculator {
        public static String
        calculateGrade(Student student) {
        int marks = student.getMarks();
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
