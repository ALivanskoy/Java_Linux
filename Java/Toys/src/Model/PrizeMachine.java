package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class PrizeMachine implements Iterable {

//    Разыгрывающая машина. Данный класс выполняет работу по определению выигранной игрушки.
//    У машины есть заводской ТЭГ(id) и пул игрушек для розыгрыша.
//    Шанс выиграть конкретную игрушку зависит от кол-ва таких игрушек в пуле машины.


    private Integer id;
    private ArrayList<Toy> toysPool;

    public PrizeMachine(Integer id, ArrayList<Toy> toysPool) {
        this.id = id;
        this.toysPool = toysPool;
    }

    public PrizeMachine() {
        this(new Random().nextInt(100000, 999999), new ArrayList<Toy>());
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<Toy> getToysPool() {
        // Возвращает список всех игрушек в пуле автомата
        return toysPool;
    }

    public ArrayList<Toy> getToysList() {
        // Возвращает список разновидностей игрушек в пуле автомата
        return new ArrayList<Toy>(new HashSet<Toy>(this.toysPool));


    }

    public void add(Toy toy) {
        //Метод добавления игрушки в машину
        this.toysPool.add(toy);
    }

    public Toy getPrize() {
        // Мотод, отдающий игрушку

        if (!toysPool.isEmpty()) {
            int index = new Random().nextInt(this.toysPool.size() - 1);

            Toy toy = toysPool.get(index);
            this.toysPool.remove(index);
            return toy;
        }
        return new Toy(" Пусто ");
    }

    @Override
    public String toString() {
        return "Игровая машина ID" + id;
    }

    @Override
    public Iterator<Toy> iterator() {
        return toysPool.iterator();
    }
}


