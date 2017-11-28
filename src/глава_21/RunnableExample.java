package глава_21;

public class RunnableExample implements Runnable {

    private static int id = 1;

    public RunnableExample() {
        System.out.println("Hello from constructer.");
    }

    public String message() {
        return "Hello from run [" + id + "] ";
    }

    public void run() {
        while (id <= 3) {
            System.out.println(message());
            Thread.yield();
            id++;
        }
        System.out.println("Finish.");
    }
}
