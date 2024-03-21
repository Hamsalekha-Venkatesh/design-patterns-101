package java.monkey_patching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Proxy;
import java.org.modernjava.monkey_patching.LoggingInvocationHandler;
import java.org.modernjava.monkey_patching.MoneyConvertor;

public class LoggingInvocationHandlerTest {

    @Test
    public void testWhenMethodCalled_thenSurroundedByLogs() {
        ByteArrayOutputStream logOutput = new ByteArrayOutputStream();
        System.out.println(new PrintStream(logOutput));

        MoneyConvertor moneyConvertor = new MoneyConvertor();
        MoneyConvertor proxy = (MoneyConvertor) Proxy.newProxyInstance(
                MoneyConvertor.class.getClassLoader(),
                new Class[] {MoneyConvertor.class},
                new LoggingInvocationHandler(moneyConvertor)
        );

        double result = proxy.convertEuroToUSD(100);
        Assertions.assertEquals(150, result);
    }
}
