package глава_21_rework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {

    @Override
    public void run(){
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                // old way
                // Thread.sleep(100);
                // Java 5/6 way
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 0; i++) {
            service.execute(new SleepingTask());
        }
        service.shutdown();
    }

}
