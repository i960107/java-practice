package clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("clazz.Person");
        Person person = (Person) c1.newInstance();
        person.setName("kim");
        person.setAge(20);
        System.out.println(person);

        Class c2 = person.getClass();
        Person person2 = (Person) c2.newInstance();
        System.out.println(person2);

        Class[] parameterTypes = {String.class};
        Constructor con = c2.getConstructor(parameterTypes);
        Object[] initargs = {"lee"};
        Person lee = (Person) con.newInstance(initargs);
        System.out.println(lee);


    }

}
