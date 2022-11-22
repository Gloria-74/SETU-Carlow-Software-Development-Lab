package Animal;

public class Vet {

    private String name;

    public Vet(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal)
    {
        System.out.println(name + " is vaccinating.");
    }

    @Override
    public String toString() {
        return "Vet {" +
                "name = '" + name + '\'' +
                '}';
    }

}
