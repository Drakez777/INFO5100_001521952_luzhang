public class Dog {
    String name;
    String breed;
    int age;
    String color;
    double weight;
    boolean isHungry;
    boolean isBarking;
    String uniqueName;

    Dog(String name, String breed, int age, String color, double weight, String uniqueName) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.isHungry = false;
        this.isBarking = false;
        this.uniqueName = uniqueName;
        System.out.println("Dog " + uniqueName + " created.");
    }

    void bark() {
    }

    void eat() {
    }

    void play() {
    }
}
