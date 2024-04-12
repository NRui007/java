package basics.operators;

public class InstanceofOperator {
    public static void main(String[] args) {
        Cat eToyCat = new EToyCat();
        System.out.println("eToyCat instanceof EToyCat is " + (eToyCat instanceof EToyCat));
        System.out.println("eToyCat instanceof EToy is " + (eToyCat instanceof EToy));
        System.out.println("eToyCat instanceof Cat is " + (eToyCat instanceof Cat));
        System.out.println("eToyCat instanceof Object is " + (eToyCat instanceof Object));

        Cat cat = new Cat();
        System.out.println("cat instanceof EToyCat is " + (cat instanceof EToyCat));
        System.out.println("cat instanceof EToy is " + (cat instanceof EToy));
        System.out.println("cat instanceof Cat is " + (cat instanceof Cat));
        System.out.println("cat instanceof Object is " + (cat instanceof Object));
    }
}

class EToyCat extends Cat implements EToy {

}

class Cat {

}

interface  EToy {

}
