import Model.PrizeMachine;
import Model.Randomizer;
import Model.Toy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PrizeMachine pm = new PrizeMachine();
        Randomizer.fillMachine(pm,2,10);

        pm.getToysPool().forEach(e -> System.out.println(e+" "));


    }
}