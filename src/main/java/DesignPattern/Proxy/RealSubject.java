package DesignPattern.Proxy;

/**
 * Created by larkin on 2014/11/13.
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something !----->" + str);
    }
}
