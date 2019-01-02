package aop;

import java.lang.annotation.*;

/**
 * @author faker
 * @date 2018/6/29
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FakerAnnotation {


    String sss() default "";
}
