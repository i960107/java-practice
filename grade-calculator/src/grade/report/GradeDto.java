package grade.report;

import grade.Score;
import grade.Student;

public class GradeDto {
    private String studentName;
    private Long studentId;
    private String requiredSubjectName;
    private int score;
    private String grade;

    public String getStudentName() {
        return studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getRequiredSubjectName() {
        return requiredSubjectName;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public GradeDto(String studentName, Long studentId, String requiredSubjectName, int score, String grade) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.requiredSubjectName = requiredSubjectName;
        this.score = score;
        this.grade = grade;
    }

    public static GradeDto from(Student student, Score score, String grade) {
        return new GradeDto(
                student.getName(),
                student.getId(),
                student.getRequiredSubject().getName(),
                score.getScore(),
                grade);
    }
}
