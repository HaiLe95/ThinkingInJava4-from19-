package глава_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTaskExample implements Runnable {
    private int random;
    private Random rnd = new Random();
    public void run() {
        System.out.println("Starting now...");
        random = rnd.nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(random);
        } catch (InterruptedException e) {
            System.err.println("Interruption");
        }
        System.out.println("Thread was sleeping for " + random + " second(s)");
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 0; i < a; i++)
            exec.execute(new SleepingTaskExample());
        exec.shutdown();
    }
}
