package java8.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Test2实体
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-22 08:22:14
 */
public class Test2 {
    private JButton button = new JButton();


    public void bindEvent(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你好！" );

            }
        });
    }

    /**
     * 使用Lambda表达式 为button添加ActionListener
     */
    public void bindEventByLambda(){
        button.addActionListener(e -> System.out.println("你好！"));
    }
}
