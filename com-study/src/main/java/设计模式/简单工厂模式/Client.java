package 设计模式.简单工厂模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Operation oper = OperationFactory.createOperation("*");
        oper.setNum1(111);
        oper.setNum2(20);
        System.out.println(oper.getResult());
    }
}
