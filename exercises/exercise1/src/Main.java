import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                PartTime partTimeStudent = new PartTime("Part-Time Student " + i);
                session.addStudent(partTimeStudent);
            } else {
                List<Integer> examScores = new ArrayList<>();
                for (int j = 0; j < 2; j++) {
                    examScores.add((int) (Math.random() * 100));
                }
                FullTime fullTimeStudent = new FullTime("Full-Time Student " + i, examScores);
                session.addStudent(fullTimeStudent);
            }
        }

        session.calculateAverageQuizScores();
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
    }
}