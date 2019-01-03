package 设计模式.简单工厂模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Add extends Operation {
    @Override
    public double getResult() {
        return super.getNum1() + super.getNum2();
    }
}
