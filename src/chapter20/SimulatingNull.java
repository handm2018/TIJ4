package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : handongming
 * @date : Created in 2019/8/15 14:04
 * @description:注解中的元素不能为空或null，所以在定义注解的时候，会赋予特殊的默认值，来表示该元素是null
 * @modified By:
 * @version:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SimulatingNull {
    public int id() default -1;
    public String description() default "";

}
