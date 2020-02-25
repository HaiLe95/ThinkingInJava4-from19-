package глава_21_rework;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.*;

class ADaemon implements Runnable {

    @Override
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("InterruptedException via");
        } finally {
            print("Is this always running?");
        }
    }

}

public class DaemonsDontRunFinally {

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new ADaemon());
            thread.isDaemon();
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
