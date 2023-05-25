package grade;

import grade.policy.NormalSubjectGradePolicy;
import grade.policy.RequiredSubjectGradePolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(211213L, "강감찬", Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE);
        student1.addScore(kor
        );
        Student student2 = new Student(212330L, "김유신", Major._COMPUTER_SCIENCE);
        Student student3 = new Student(201518L, "신사임당", Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE);
        Student student4 = new Student(202360L, "이순신", Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE);
        Student student5 = new Student(201290L, "홍길동", Major._COMPUTER_SCIENCE);

        List<Student> studentsList = Arrays.asList(
                new Student(211213L, "강감찬",
                        Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE,
                        Map.of(Subject.KOREAN, 95, Subject.MATH, 56)),
                new Student(212330L, "김유신",
                        Major._COMPUTER_SCIENCE,
                        Map.of(Subject.KOREAN, 95, Subject.MATH, 95)),
                new Student(201518L, "신사임당",
                        Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE,
                        Map.of(Subject.KOREAN, 100, Subject.MATH, 88)),
                new Student(202360L, "이순신",
                        Major.KOREAN_LANGUAGE_AND_KOREAN_LITERATURE,
                        Map.of(Subject.KOREAN, 89, Subject.MATH, 95)),
                new Student(201290L, "홍길동",
                        Major._COMPUTER_SCIENCE,
                        Map.of(Subject.KOREAN, 85, Subject.MATH, 56))
        );

        Map<GradePolicyCode, GradePolicy> policies = new HashMap<>();
        // TODO: 2023/05/24 단순히 map은 unordered임. sections은 점수 내림차순으로 접근해야 올바른 값 나오므로 linkedhahsmap사용.
        Map<Integer, String> normalGrades = new LinkedHashMap<>();
        normalGrades.put(90, "A");
        normalGrades.put(80, "B");
        normalGrades.put(70, "C");
        normalGrades.put(55, "D");
        normalGrades.put(0, "F");
        GradePolicy normal = new NormalSubjectGradePolicy(normalGrades);
        policies.put(GradePolicyCode.NORMAL_SUBJECT, normal);

        Map<Integer, String> requiredGrades = new LinkedHashMap<>();
        requiredGrades.put(95, "S");
        requiredGrades.put(90, "A");
        requiredGrades.put(80, "B");
        requiredGrades.put(70, "C");
        requiredGrades.put(60, "D");
        requiredGrades.put(0, "F");
        GradePolicy required = new RequiredSubjectGradePolicy(requiredGrades);
        policies.put(GradePolicyCode.REQUIRED_SUBJECT, required);

        School goodSchool = new School(studentsList, policies);
        goodSchool.showStudentsGradeOf(Subject.KOREAN);
        System.out.println();
        goodSchool.showStudentsGradeOf(Subject.MATH);
    }
}
