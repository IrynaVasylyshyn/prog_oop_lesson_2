package base;

public class Veterinarian {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        System.out.println("The " + animal.toString() + " was successfully treated by " + name);
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
