import Model.PrizeMachine;
import Model.Randomizer;
import Model.Toy;
import Presenter.Presenter;
import View.PrizeMachineView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PrizeMachine prizeMachine = new PrizeMachine();
        Randomizer.fillMachine(prizeMachine,5,10);
        Presenter presenter = new Presenter(prizeMachine);

        presenter.run();

    }
}