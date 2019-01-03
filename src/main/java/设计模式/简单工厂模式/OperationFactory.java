package 设计模式.简单工厂模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
            default:
        }
        return oper;
    }
}
