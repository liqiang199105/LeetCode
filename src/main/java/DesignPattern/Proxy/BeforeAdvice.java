package DesignPattern.Proxy;

/**
 * Created by larkin on 2014/11/13.
 */
public class BeforeAdvice implements Advice {

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
