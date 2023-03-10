package Presenter;

import Model.PrizeMachine;
import View.PrizeMachineView;

import java.util.Scanner;

public class Presenter {

    private PrizeMachine prizeMachine;
    private PrizeMachineView prizeMachineView;


    public Presenter(PrizeMachine prizeMachine) {
        this.prizeMachine = prizeMachine;
        this.prizeMachineView = new PrizeMachineView(this.prizeMachine);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int swither;
        boolean exitPoint = true;

        do {

            prizeMachineView.showMenu();
            swither = Integer.parseInt(scanner.nextLine());

            switch (swither) {
                case 1:
                    prizeMachineView.showMachine();
                    break;
                case 2:
                    prizeMachineView.showPrize(prizeMachine.getPrize());
                    break;
                case 3:
                    exitPoint = false;
                    break;
                default:
                    System.out.println("\n\nНеожиданный ввод, попробуй ещё раз\n\n");
                    break;
            }

        } while (exitPoint);


    }
}
