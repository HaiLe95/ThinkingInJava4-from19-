package глава_21;
import java.util.concurrent.*;
import static net.mindview.util.Print.*;

class ADeamon implements Runnable {

    @Override
    public void run() {
        try {
            print("Startin ADeamon");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run");
        }
    }
}
public class DeamonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
        t.setDaemon(true);
        t.start();
    }
}
