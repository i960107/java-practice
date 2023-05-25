package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.append("android");
        System.out.println(sb);
        //해시코드 같음.
        System.out.println(sb.hashCode());

    }
}
