package DesignPattern.Mediator;

/**
 * Created by larkin on 2014/11/14.
 */
public class ConcreteColleague1 extends Colleague {


    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod(){
        // 处理自己的业务
    }
    public void depMethod(){
        super.mediator.doSomething1();
    }
}
