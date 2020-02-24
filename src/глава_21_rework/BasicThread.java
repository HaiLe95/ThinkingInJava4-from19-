package глава_21_rework;

public class BasicThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff...");
    }

}
