package 设计模式.代理模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(Girl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
