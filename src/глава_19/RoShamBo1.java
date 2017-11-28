package глава_19;

/**
 * Created by Хай Ле on 20.05.2017.
 */

import java.util.*;
import static глава_19.Outcome.*;

interface Item {
    Outcome complete(Item it);
    Outcome eval(Paper p);
    Outcome eval(Scissors s);
    Outcome eval(Rock r);
}

class Paper implements Item {
    @Override
    public Outcome complete(Item it) { return it.eval(this); }
    @Override
    public Outcome eval(Paper p) { return DRAW; }
    @Override
    public Outcome eval(Scissors s) { return WIN; }
    @Override
    public Outcome eval(Rock r) { return LOSE; }
    public String toString() { return "Paper"; }
}

class Scissors implements Item {
    @Override
    public Outcome complete(Item it) { return it.eval(this);}
    @Override
    public Outcome eval(Paper p) { return LOSE; }
    @Override
    public Outcome eval(Scissors s) { return DRAW; }
    @Override
    public Outcome eval(Rock r) { return WIN; }
    public String toString() { return "Scissors"; }
}

class Rock implements Item {
    @Override
    public Outcome complete(Item it) { return it.eval(this); }
    @Override
    public Outcome eval(Paper p) { return WIN; }
    @Override
    public Outcome eval(Scissors s) { return LOSE; }
    @Override
    public Outcome eval(Rock r) { return DRAW; }
    public String toString() { return "Rock"; }
}

public class RoShamBo1 {
    static final int SIZE = 20;
    private static Random rand = new Random(47);
    public static  Item newItem() {
        switch (rand.nextInt(3)) {
            default:
            case 0 : return new Scissors();
            case 1 : return new Paper();
            case 2 : return new Rock();
        }
    }
    public static void match(Item a, Item b) {
        System.out.println( a + " vs. " + b + ": " + a.complete(b));
    }

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++)
            match(newItem(), newItem());
    }
}
