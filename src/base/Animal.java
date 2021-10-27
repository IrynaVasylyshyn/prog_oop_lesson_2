package base;

import java.util.Objects;

public abstract class Animal {

    private String ration;
    private String color;
    private int weight;

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected Animal() {
    }

    protected Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    abstract String getVoice();

    abstract void eat();

    abstract void sleep();

    @Override
    public String toString() {
        return "Animal{" +
                "ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getWeight() == animal.getWeight() &&
                getRation().equals(animal.getRation()) &&
                getColor().equals(animal.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRation(), getColor(), getWeight());
    }
}
