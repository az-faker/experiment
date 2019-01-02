package 设计模式.简单工厂模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Div extends Operation {
    @Override
    public double getResult() throws Exception {
        if (super.getNum2() == 0) {
            throw new Exception("除数不能为零");
        }
        return super.getNum1() / super.getNum2();
    }
}
