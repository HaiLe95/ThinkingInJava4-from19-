package глава_21_rework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SettingsDefaultHandler {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new ExceptionThread());
    }

}
