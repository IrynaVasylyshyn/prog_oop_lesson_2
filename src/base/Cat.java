package base;

public class Cat extends Animal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        super();
    }

    public Cat(String name) {
        super();
        this.name = name;
    }

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    String getVoice() {
        return "Meow-meow";
    }

    @Override
    void eat() {
        System.out.println("Cats eat: " + getRation());
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep 16 hours");
    }

    @Override
    public String toString() {
        return "Cat{" +
                    "name='"    + name + '\'' +
                    "ration='"  + this.getRation() + '\'' +
                    "color='"   + this.getColor()  + '\'' +
                    "weight='"  + this.getWeight() + '\'' +
                '}';
    }
}
