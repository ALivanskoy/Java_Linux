import Model.PrizeMachine;
import Model.Toy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PrizeMachine pm = new PrizeMachine();
        Toy t = new Toy("Toy123");

        for (int i = 0; i < 10; i++) {

            pm.add(new Toy(i, "Toy" + i));
            pm.add(t);
        }


    }
}