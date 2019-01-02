package 设计模式.简单工厂模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Operation {
    private double num1 = 0;
    private double num2 = 0;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() throws Exception {
        return 0;
    }
}
