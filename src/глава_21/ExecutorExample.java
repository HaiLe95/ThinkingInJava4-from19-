package глава_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello from exec: " + i);
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }

}
