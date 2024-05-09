package oop;

public class Dog {
    // Instance variables
    private String name;
    private int age;
    private String color;
    private String breed;

    // Constructor
    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    // Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // declare object and initialize it
        Dog dog = new Dog("大黄", 2, "red", "blue");
        System.out.println(dog.toString());
    }
}
