package 设计模式.策略模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class CashReturn extends CashSuper{
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money > moneyCondition) {
            result = money - moneyReturn;
        }
        return result;
    }
}
