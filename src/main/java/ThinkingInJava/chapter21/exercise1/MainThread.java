package ThinkingInJava.chapter21.exercise1;

/**
 *
 * Created by Larkin on 7/10/15.
 */
public class MainThread {
    public static void main(String [] args){
        for (int i = 0; i < 5; i++){
            new Thread(new BasicThread()).start();
        }
    }
}
