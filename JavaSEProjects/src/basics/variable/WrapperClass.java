package basics.variable;

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {
        // print primitive data types
        char ch1 = 'a';
        boolean bo1 = true;
        byte b1 = 2;
        short s1 = 155;
        int i1 = 123;
        long l1 = 456L;
        float f1 = 3.14f;
        double d1 = 5.65;

        System.out.println("print primitive data types:  ");
        System.out.println("char values: " + ch1);
        System.out.println("boolean values: " + bo1);
        System.out.println("byte values: " + b1);
        System.out.println("short values: " + s1);
        System.out.println("int i values: " + i1);
        System.out.println("long values: " + l1);
        System.out.println("float values: " + f1);
        System.out.println("double values: " + d1);

        // print wrapper class object
        Character ch2 = new Character(ch1);
        Boolean bo2 = new Boolean(bo1);
        Byte b2 = new Byte(b1);
        Short s2 = new Short(s1);
        Integer i2 = new Integer(i1);
        Long l2 = new Long(l1);
        Float f2 = new Float(f1);
        Double d2 = new Double(d1);

        System.out.println("print wrapper class object:");
        System.out.println("Character Object: " + ch2);
        System.out.println("Boolean Object: " + bo2);
        System.out.println("Byte Object: " + b2);
        System.out.println("Short Object: " + s2);
        System.out.println("Integer Object: " + i2);
        System.out.println("Long Object: " + l2);
        System.out.println("Float Object: " + f2);
        System.out.println("Double Object: " + d2);
    }
}
