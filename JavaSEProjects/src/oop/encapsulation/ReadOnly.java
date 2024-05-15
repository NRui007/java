package oop.encapsulation;

class Student {
    private String college = "CSC";
    public String getCollege() {
        return college;
    }
}

public class ReadOnly {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("college is " + student.getCollege());
    }
}
