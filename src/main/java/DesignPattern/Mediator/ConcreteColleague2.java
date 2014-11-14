package DesignPattern.Mediator;

/**
 * Created by larkin on 2014/11/14.
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2(){

    }
    public void depMethod2(){
        super.mediator.doSomething2();
    }
}
