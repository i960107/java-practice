package exception;

class AutoClosableObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }
}

public class AutoClosableObjTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoClosableObj();
        try(obj){
            System.out.println("exception");
        }catch (Exception e){
            System.out.println("exception");
        }
    }

}
