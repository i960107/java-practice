package clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicBindingTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();
        for (Constructor cconstructor : cons) {
            System.out.println(cconstructor);
        }

        System.out.println();

        Method[] methods = c.getMethods();
        for(Method method: methods){
            System.out.println(method);
        }
    }
}
