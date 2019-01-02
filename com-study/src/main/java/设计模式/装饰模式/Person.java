package 设计模式.装饰模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
