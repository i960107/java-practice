package object;

class Student implements Cloneable{

    private int studentNumber;
    private String name;

    public Student(int studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public void setStudentName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return studentNumber + "," + name;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            if (s.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(1, "김수현");
        Student student2 = new Student(1, "김수현");
        //equals() override전 주소값을 비교.
        System.out.println(student2.equals(student1));
        //hashcode() override전 해시코드 값이 다름.
        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("------string--------");
        //서로 다른 객체이지만 해시코드 값은 같음.
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.equals(str2));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        //Integer의 hashcode()는 그 값을 반환.
        Integer i = 100;
        System.out.println(i.hashCode());

        Student copyStudent = (Student) student1.clone();
        student1.setStudentName("조화수");
        System.out.println(copyStudent.toString());

    }

}
