package chapter20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : handongming
 * @date : Created in 2019/8/15 12:59
 * @description: 注解处理器，注解最核心的地方就在于注解处理器，如果没有注解处理器，那么自定义的注解将没有任何用处
 * @modified By:
 * @version:
 */
public class UseCaseTracker {

    public static void trackerUserCase(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase u = m.getAnnotation(UseCase.class);
            if (u != null) {
                System.out.println("Found Use Case:" + u.id() + " " + u.description());
                useCases.remove(new Integer(u.id()));
            }

        }

        for (Integer i : useCases) {
            System.out.println("Missing Use Case" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>(10);
        Collections.addAll(useCases,47,48,49);
        trackerUserCase(useCases,PasswordUtils.class);
    }
}
