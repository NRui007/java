package oop;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student(16,"Jack");
        System.out.println(student2);

        Student student3 = new Student(15, "Mary", 46.2);
        System.out.println(student3);
    }
}

class Student {
    int age;
    String name;
    double height;

    public Student() {
    }

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
