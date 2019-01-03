package java反射;

/**
 * @author faker
 * @date 2018/7/18
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("java反射.Student");

        Class c2 = java反射.Student.class;

        Student s = new Student();
        Class c3 = s.getClass();

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}
