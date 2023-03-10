package View;

import Model.PrizeMachine;
import Model.Toy;

import java.util.Random;

public class PrizeMachineView {

    private PrizeMachine prizeMachine;
    private int machineLength;
    private Character paintChar;


    public PrizeMachineView(PrizeMachine prizeMachine) {
        this.prizeMachine = prizeMachine;
        this.machineLength = 60;    //эти параметры задаются по-умолчанию
        this.paintChar = '#';       //и меняются на ваш страх и риск

    }

    public void showMenu(){
        System.out.println("Меню:");
        System.out.println("1 Показать автомат");
        System.out.println("2 Получить свой приз");
        System.out.println("3 Выйти");
        System.out.println("Ожидается ввод цифры без точки");
    }

    public void showMachine() {

        printLine(paintChar, this.machineLength);
        printMassage(" "+prizeMachine.toString()+" ", this.paintChar, this.machineLength);
        printLine(paintChar, this.machineLength);


        for (int i = 0; i != prizeMachine.getToysPool().size()*2; i++) {
            if (i % 2 == 0) printMassage(prizeMachine.getToysPool().get(i/2).toString(),
                    this.paintChar, this.machineLength);
            else  printLine(paintChar, this.machineLength);

        }

        printLine(paintChar, this.machineLength);
        printLine(paintChar, this.machineLength);

    }

    public void showPrize(Toy toy){

        switch (new Random().nextInt(5)) {
            case 0:
                System.out.println("\nОго! Да ты везунчик! Посмотри, что тебе досталось!\n\n");
                break;
            case 1:
                System.out.println("\nНичего-себе, что же это в коробке?\n\n");
                break;
            case 2:
                System.out.println("\nЗавидую, тебе вон оно чо выпало, а я просто текст!\n\n");
                break;
            case 3:
                System.out.println("\nПочему такой грустный?! Если бы это был реальный автомат, то ты мог бы получить:\n\n");
                break;
            case 4:
                System.out.println("\nЯ почти тебе завидую, мне действительно не хватает в быту вот этого вот \n\n");
                break;
            default:
                System.out.println("\nПо вопросам размещения рекламы звонить 8(800)555-35-35\n\n");
                break;
        }

        int magicLength = toy.toString().length()*2;

        for (int i = 0; i < 3; i++) {

            switch (i){
                case 1:
                    printMassage(" "+toy.toString()+" ", '%', magicLength);
                    break;
                default:
                    printLine('%', magicLength);
                    break;
            }
        }
        System.out.println("\n");
    }

    private void printLine(Character symbol, int length) {

        for (int i = 0; i != length; i++) {
            System.out.print(symbol);
        }
        System.out.print("\n");
    }

    public void setMachineLength(int machineLength) {
        this.machineLength = machineLength;
    }

    public void setPaintChar(Character paintChar) {
        this.paintChar = paintChar;
    }

    private void printMassage(String massage, Character symbol, int length) {

        if (massage.length() >= length) {
            printLine(symbol, length);
        } else {
            for (int i = 0; i < length / 2 - massage.length() / 2; i++) {
                System.out.print(symbol);
            }
            System.out.print(massage);
            for (int i = length / 2 + massage.length() / 2; i != length; i++) {
                System.out.print(symbol);
            }
            System.out.print("\n");
        }


    }


}
