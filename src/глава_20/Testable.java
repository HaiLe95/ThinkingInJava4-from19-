package глава_20;

/**
 * Created by Хай Ле on 21.05.2017.
 */
import net.mindview.atunit.*;

public class Testable {
    public void execute() {
        System.out.println("Executing...");
    }
    @Test
    void testExecute() { execute(); }
}
