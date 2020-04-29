package глава_21_rework;

public class EvenGenerator extends IntGenerator {

    public int currentEvenValue = 0;

    public int next() {
        ++currentEvenValue;     // Dangerous point
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }

}
