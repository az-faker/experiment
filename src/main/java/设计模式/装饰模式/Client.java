package 设计模式.装饰模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("faker");
        System.out.println("第一种装扮在");

        Tshirts tshirts = new Tshirts();
        BigTrouser bigTrouser = new BigTrouser();

        tshirts.decorate(person);
        tshirts.show();
        bigTrouser.decorate(person);
        bigTrouser.show();
    }
}
