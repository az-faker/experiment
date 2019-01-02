package 设计模式.代理模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Client {
    public static void main(String[] args) {
        Girl mm = new Girl("jiaojiao");

        Proxy daili = new Proxy(mm);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
