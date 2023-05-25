package data_type;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int) ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        //unicode를 사용하는 방법
        char han = '한';
        //16진수. 4비트 * 4 = 2바이트.
        char unicodeHan = '\uD55C';
        System.out.println(han);
        System.out.println(unicodeHan);
    }

}
