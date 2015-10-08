package ThinkingInJava.chapter21.exercise1;

/**
 * Created by Larkin on 7/10/15.
 */
public class BasicThread implements Runnable {

    public BasicThread() {
        System.out.println("Startup the BasicThread.");
    }

    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println("Run BasicThread.");
         }

    }
}
