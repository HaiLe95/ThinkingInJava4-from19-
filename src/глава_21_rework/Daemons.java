package глава_21_rework;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.*;

class Daemon implements Runnable {

    private Thread[] threads = new Thread[10];

    @Override
    public void run(){
        for (int i = 0;i < threads.length; i++) {
            threads[i] = new Thread(new DaemonSpawn());
            threads[i].start();
            printnb("DaemonSpawn " + i + " started, ");
        }
        for (int i = 0; i < threads.length; i++) {
            printnb("t[ " + i + "].isDeamon() = " +
            threads[i].isDaemon() + "), ");
            while (true)
                Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {

    @Override
    public void run() {
        while (true)
            Thread.yield();
    }

}

public class Daemons {

    public static void main(String[] args) {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        printnb("thread.isDaemon() = " + thread.isDaemon() + ", ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

