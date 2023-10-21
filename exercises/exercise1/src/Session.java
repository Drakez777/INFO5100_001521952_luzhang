import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Session {
    List<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void calculateAverageQuizScores() {
        for (Student student : students) {
            int totalQuizScore = 0;
            for (Integer score : student.quizScores) {
                totalQuizScore += score;
            }
            double averageQuizScore = totalQuizScore / (double) student.quizScores.size();
            System.out.println(student.name + " - Average Quiz Score: " + averageQuizScore);
        }
    }

    public void printQuizScoresAscending() {
        List<Integer> allQuizScores = new ArrayList<>();
        for (Student student : students) {
            allQuizScores.addAll(student.quizScores);
        }
        Collections.sort(allQuizScores);
        System.out.println("Quiz Scores in Ascending Order: " + allQuizScores);
    }

    public void printPartTimeStudents() {
        System.out.println("Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.println(student.name);
            }
        }
    }
}
