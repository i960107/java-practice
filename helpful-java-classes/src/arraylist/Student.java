package arraylist;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    private ArrayList<Subject> subjectList;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        subjectList = new ArrayList<>();
    }

    //어떤게 더 좋은 구조? 사용자가 subject 내부 구조 알 필요 없도록.
//    public void addSubject(Subject subject) {
//        this.subjectList.add(subject);
//    }
    public void addSubject(String subjectName, int score) {
        this.subjectList.add(new Subject(subjectName, score));
    }

    public void showInfo() {
        int total = 0;
        for (Subject subject : subjectList) {
            total += subject.getScore();
            StringBuilder sb = new StringBuilder();
            sb.append("학생 ");
            sb.append(this.name);
            sb.append("의 ");
            sb.append(subject.getTitle());
            sb.append(" 과목 성적은 ");
            sb.append(subject.getScore());
            sb.append("입니다.");
            System.out.println(sb);
        }
        System.out.println("학생 " + name + "의 총점은 " + total + " 입니다.");
    }
}
