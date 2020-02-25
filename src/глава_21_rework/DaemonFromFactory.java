package глава_21_rework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static net.mindview.util.Print.*;

public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e){
            print("Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for(int i = 0; i < 10; i++) {
            service.execute(new DaemonFromFactory());
        }
        print("All daemon started");
        TimeUnit.MILLISECONDS.sleep(500);
        service.shutdown();
    }
}
