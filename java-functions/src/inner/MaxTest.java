package inner;

@FunctionalInterface
interface Max {
    int getMax(int x, int y);
}

public class MaxTest {
    public static void main(String[] args) {
        Max max = (x, y) -> x > y ? x : y;
        System.out.println(max.getMax(2, 3));
    }

}
