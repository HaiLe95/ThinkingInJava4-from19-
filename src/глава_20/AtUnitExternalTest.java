package глава_20;
//Нихуя не работает с net.mindview
//import net.mindview.atunit.*;
//import net.mindview.util.*;

import org.junit.*;
public class AtUnitExternalTest extends AtUnitExample1 {

    @Test boolean __methodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean _methodTwo() {
        return methodTwo() == 2;
    }

    public static void main(String[] args) throws Exception {
//        OSExecute.command(
//                "java net.mindview.atunit.AtUnit AtUnitExternalTest"
//        );
    }

}
