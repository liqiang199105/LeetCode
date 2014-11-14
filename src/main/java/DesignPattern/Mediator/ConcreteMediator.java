package DesignPattern.Mediator;

/**
 * Created by larkin on 2014/11/14.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.selfMethod();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod();
        super.c2.selfMethod2();
    }
}
