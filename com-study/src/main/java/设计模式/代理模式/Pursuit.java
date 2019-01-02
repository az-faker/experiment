package 设计模式.代理模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Pursuit implements GiveGift {

    Girl mm;

    public Pursuit(Girl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(String.format("送洋娃娃给%s", mm));
    }

    @Override
    public void giveFlowers() {
        System.out.println(String.format("送鲜花给%s", mm));
    }

    @Override
    public void giveChocolate() {
        System.out.println(String.format("送巧克力给%s", mm));
    }
}
