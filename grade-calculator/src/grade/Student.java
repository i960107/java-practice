package grade;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private Major major;
    private List<Score> scores = new ArrayList<>();

    //Score객체가 Student를 포함하기 때문에 불가능한 생성자
//    public Student(Long id, String name, Major major, List<Score> scores) {
//        this.id = id;
//        this.name = name;
//        this.major = major;
//        this.scores = scores;
//    }

    public Student(Long id, String name, Major major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public void addScore(Subject subject, int score) {
        Score subjectScore = new Score(this, subject, score);
        scores.add(subjectScore);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Subject getRequiredSubject() {
        return major.getRequiredSubject();
    }

    public boolean isRequired(Subject subject) {
        return major.isRequired(subject);
    }

    public Score getScoreOf(Subject subject) {
        for (Score score : scores) {
            if (score.isScoreOf(subject)) {
                return score;
            }
        }
        return null;
    }


    public String calculateGrade(GradePolicy policy, Subject subject) {
        return policy.calculateGrade(getScoreOf(subject).getScore());
    }
}
