package base;

public class Dog extends Animal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        super();
    }

    public Dog(String name) {
        super();
        this.name = name;
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    String getVoice() {
        return "Woof-woof";
    }

    @Override
    void eat() {
        System.out.println("Dogs eat: " + getRation());
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 13-15 hours");
    }

    @Override
    public String toString() {
        return "Dog{" +
                    "name='"    + name + '\'' +
                    "ration='"  + super.getRation() + '\'' +
                    "color='"   + super.getColor()  + '\'' +
                    "weight='"  + super.getWeight() + '\'' +
                '}';
    }
}
