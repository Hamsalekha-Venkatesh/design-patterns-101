package java.org.modernjava.monkey_patching;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(final Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling the method " + method.getName());

        Object result = method.invoke(target, args);

        System.out.println("after calling the method " + method.getName());

        return result;
    }
}
