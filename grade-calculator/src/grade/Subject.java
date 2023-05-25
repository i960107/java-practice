package grade;

public enum Subject {
    KOREAN("국어"), MATH("수학");
    private String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//public class Subject {
//    private static Map<String, Subject> subjects = new HashMap();
//    private String name;
//
//    // 한 과목당 하나의 객체만 만들고 싶다면..? -> Enum으로 관리하면?
//    private Subject(String name) {
//        this.name = name;
//        subjects.put(name, this);
//    }
//
//    public Subject getInstance(String name) {
//        return subjects.getOrDefault(name, new Subject(name));
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (obj instanceof Subject) {
//            Subject objSubject = (Subject) obj;
//            if (obj.hashCode() == this.hashCode()) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
