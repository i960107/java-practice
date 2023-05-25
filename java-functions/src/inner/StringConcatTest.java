package inner;

interface StringConcat {
    void makeString(String s1, String s2);
}

class StringConcatImpl implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + s2);
    }
}

public class StringConcatTest {
    public static void main(String[] args) {
        String firstString = "hello";
        String secondString = "world";
        StringConcat scImpl = new StringConcatImpl();
        scImpl.makeString(firstString, secondString);

        StringConcat concat = (s1, s2) -> System.out.println(s1 + s2);
        //실제 익명 내부 클래스 만들어짐
        StringConcat actualConcat = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + s2);
            }
        };
        concat.makeString(firstString, secondString);
    }

}
