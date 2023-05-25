package grade.report;

import grade.School;
import grade.Subject;
import java.util.List;

public class ReportGenerator {
    private School school;

    public ReportGenerator(School school) {
        this.school = school;
    }

    //과목별 점수 표시하기
    public void showStudentsGradeOf(Subject subject) {
        showHeader(subject);
        List<GradeDto> gradeDtoList = school.getStudentsGradeOf(subject);
        for (GradeDto grade : gradeDtoList) {
            showGradeOf(grade);
            showDivideLine();
        }
    }

    private void showHeader(Subject subject) {
        showDivideLine();
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t");
        sb.append(subject.getName());
        sb.append(" 수강생 ");
        sb.append(" 학점 ");
        sb.append(System.lineSeparator());
        sb.append(" 이름  ");
        sb.append("|    학번    ");
        sb.append("| 중점과목 ");
        sb.append("|  점수");
        System.out.println(sb);
        showDivideLine();
    }

    private void showDivideLine() {
        System.out.println("---------------------------------");
    }

    private void showGradeOf(GradeDto dto) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-5s", dto.getStudentName())).append("|");
        sb.append(String.format("%-10d", dto.getStudentId())).append("|");
        sb.append(String.format("%-6s", dto.getRequiredSubjectName())).append("|");
//        String grade;
//        if (student.isRequired(subject)) {
//            grade = student.getGradeof(policies.get(GradePolicyCode.REQUIRED_SUBJECT), subject);
//        } else {
//            grade = student.getGradeof(policies.get(GradePolicyCode.NORMAL_SUBJECT), subject);
//        }
        sb.append(dto.getScore());
        sb.append(" : ");
        sb.append(dto.getGrade() + " |");
        System.out.println(sb);
    }

}
