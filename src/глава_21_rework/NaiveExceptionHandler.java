package глава_21_rework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaiveExceptionHandler {

    public static void main(String[] args) {
        try {
            ExecutorService eService = Executors.newCachedThreadPool();
            eService.execute(new ExceptionThread());
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("You have to honk to stay stronk");
        }
    }
}
