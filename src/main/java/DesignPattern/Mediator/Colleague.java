package DesignPattern.Mediator;

/**
 * Created by larkin on 2014/11/14.
 */
public abstract class Colleague {

    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
