package DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by larkin on 2014/11/13.
 */
public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finish");

    }
}
