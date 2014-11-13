package DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by larkin on 2014/11/13.
 *
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?> [] interfaces, InvocationHandler handler){

        if (true) {

        }
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
