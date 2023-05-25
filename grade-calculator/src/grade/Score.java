package grade;

public class Score {
    private Student student;
    private Subject subject;
    private int score;

    public Score(Student student, Subject subject, int score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public boolean isScoreOf(Subject subject) {
        return this.subject == subject;
    }

    public int getScore() {
        return score;
    }
}
