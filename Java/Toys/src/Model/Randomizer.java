package Model;

import java.util.*;

public class Randomizer {
    // Класс для создания рандомных игрушек и
    // наполнения рандомного наполнения машины


    public static Toy makeRandomToy() {

        StringBuilder sb = new StringBuilder();

        switch (new Random().nextInt(5)) {
            case 0:
                sb.append("Плюшевый");
                break;
            case 1:
                sb.append("Пластиковый");
                break;
            case 2:
                sb.append("Резиновый");
                break;
            case 3:
                sb.append("Надувной");
                break;
            case 4:
                sb.append("Деревянный");
                break;
            default:
                sb.append("ошибка1");
                break;
        }
        sb.append(" ");

        switch (new Random().nextInt(6)) {
            case 0:
                sb.append("яркий");
                break;
            case 1:
                sb.append("мягкий");
                break;
            case 2:
                sb.append("интерактинвый");
                break;
            case 3:
                sb.append("музыкальный");
                break;
            case 4:
                sb.append("светящийся");
                break;
            case 5:
                sb.append("развивающий");
                break;
            default:
                sb.append("ошибка2");
                break;
        }
        sb.append(" ");

        switch (new Random().nextInt(6)) {
            case 0:
                sb.append("самолёт");
                break;
            case 1:
                sb.append("конструктор");
                break;
            case 2:
                sb.append("мяч");
                break;
            case 3:
                sb.append("автомобиль");
                break;
            case 4:
                sb.append("робот");
                break;
            case 5:
                sb.append("динозавр");
                break;
            default:
                sb.append("ошибка3");
                break;
        }

        return new Toy(sb.toString());
    }

    public static void fillMachine(PrizeMachine pm, int toysTypesNumber, int toysNumber) {
        //pm - наполняемая машина
        //toysTypesNumber - количество разнообразных игрушек
        //toysNumber - количество игрушек, добавляемое в машину

        ArrayList<Toy> toysTypes = new ArrayList<>();

        for (int i = 0; i < toysTypesNumber; i++) {
            toysTypes.add(Randomizer.makeRandomToy());
        }

        Random random = new Random();

        for (int i = 0; i < toysNumber; i++) {

            pm.add(toysTypes.get(random.nextInt(toysTypesNumber)));

        }

    }


}
