import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    List<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        quizScores = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            quizScores.add((int) (Math.random() * 100));
        }
    }
}

class PartTime extends Student {
    public PartTime(String name) {
        super(name);
    }
}

class FullTime extends Student {
    List<Integer> examScores;

    public FullTime(String name, List<Integer> examScores) {
        super(name);
        this.examScores = examScores;
    }
}