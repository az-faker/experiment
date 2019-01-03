package 设计模式.策略模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
