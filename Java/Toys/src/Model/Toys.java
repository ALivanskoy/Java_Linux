package Model;


import java.util.Comparator;

public class Toys implements Comparable <Toys> {

    private Integer id;
    private String name;

    public Toys(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toys {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Toys t) {
        return Integer.compare(this.id, t.getId());
    }
}
