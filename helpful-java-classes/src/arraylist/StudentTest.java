package arraylist;

public class StudentTest {

    public static void main(String[] args) {
        Student lee = new Student(1, "Lee");
        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);
        lee.showInfo();

        System.out.println("=====================================");

        Student kim = new Student(2, "Kim");
        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);
        kim.showInfo();

    }
}
