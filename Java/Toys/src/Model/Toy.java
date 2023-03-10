package Model;


import java.util.Random;

public class Toy implements Comparable<Toy> {
//    Описание сущности игрушки. У игрушки может быть заводской ТЭГ(id) и имя.

    private Integer id;
    private String name;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Toy(String name) {

        this(new Random().nextInt(100000, 999999), name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Игрушка \' " + name + "\'" ;
    }

    @Override
    public int compareTo(Toy t) {
        return Integer.compare(this.id, t.getId());
    }
}
