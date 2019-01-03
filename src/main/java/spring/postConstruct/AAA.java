package spring.postConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * 实例AAA
 *
 * @author Zhanglele
 * @version 1.0
 * @since 2018-08-13 10:04:23
 */
public class AAA {
    @Autowired
    private BBB b;

    public AAA() {
        System.out.println("构造函数, b = " + b);
    }

    @PostConstruct
    private void init() {
        System.out.println("@PostConstruct依赖将在依赖注入完成后被自动调用, b = " + b);
    }

    public BBB getB() {
        return b;
    }

    public void setB(BBB b) {
        this.b = b;
    }
}
