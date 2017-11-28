package глава_21;

public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start(); // Запуск потока
        System.out.println("Waiting for LiftOff");
    }
}
