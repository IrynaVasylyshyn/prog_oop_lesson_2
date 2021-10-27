package base;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("fish", "white", 7, "Kitty");
        Dog dog = new Dog("Spike");
        dog.setRation("meat");
        dog.setColor("Black");
        dog.setWeight(10);

        Veterinarian veterinarian = new Veterinarian("Dr. Strange");
        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
