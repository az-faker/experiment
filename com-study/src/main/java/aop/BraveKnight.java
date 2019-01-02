package aop;

import org.springframework.stereotype.Component;

/**
 * @author faker
 * @date 2018/6/29
 */
@Component("knight")
public class BraveKnight {
    public void say() {
        System.out.println("我是骑士（切点方法）");
    }
}
