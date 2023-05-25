package grade.policy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import grade.GradePolicy;

public class NormalSubjectGradePolicy implements GradePolicy {
    private Map<Integer, String> sections = new HashMap<>();

    public NormalSubjectGradePolicy(Map<Integer, String> sections) {
        this.sections = sections;
    }

    @Override
    public String calculateGrade(int score) {
        for (Entry<Integer, String> entry : sections.entrySet()) {
            Integer min_score = entry.getKey();
            String grade = entry.getValue();
            if (score >= min_score) {
                return grade;
            }
        }
        return null;
    }
}