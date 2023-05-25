package string;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        System.out.println(System.identityHashCode(java));

        String android = new String("android");

        java = java.concat(android);
        System.out.println(java);

        // 연결 전후 address다름. 새로운 문자열을 생성. 메모리 낭비.
        System.out.println(System.identityHashCode(java));
    }
}
