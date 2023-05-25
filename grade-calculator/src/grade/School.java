package grade;

import grade.report.GradeDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class School {
    private List<Student> students;
    // TODO: 2023/05/24 학교가 policy를 관리하는데 어떤 형태로 관리하는게 좋을까? List는 policy를 선택해서 가져올 수 없음.
    // 멤버변수로 포함하기에는 매 학교마다 다른 정책들을 관리할 수 있음.
    private Map<GradePolicyCode, GradePolicy> policies;

    public School(List<Student> students, Map<GradePolicyCode, GradePolicy> policies) {
        this.students = students;
        this.policies = policies;
    }

    public List<GradeDto> getStudentsGradeOf(Subject subject) {
        List<GradeDto> results = new ArrayList<>();
        for (Student student : students) {
            results.add(getStudentGradeOf(student, subject));
        }
        return results;
    }

    //만약 school이 policy와 협력한다면 DTO를 만들기 위해서 필요한 정보들을 따로 가져와야함 -> 정보 전문가가 아님
    private GradeDto getStudentGradeOf(Student student, Subject subject) {
        GradePolicy policy = null;
        if (student.isRequired(subject)) {
            policy = policies.get(GradePolicyCode.REQUIRED_SUBJECT_POLICY);
        } else {
            policy = policies.get(GradePolicyCode.NORMAL_SUBJECT_POLICY);
        }
        return GradeDto.from(student, student.getScoreOf(subject), student.calculateGrade(policy, subject));
    }

}
