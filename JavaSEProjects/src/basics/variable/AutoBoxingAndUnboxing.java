package basics.variable;

import java.util.ArrayList;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // AutoBoxing int -> Integer
        int i = 100;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);

        // Unboxing
        Character ch = 'a';
        char c = ch;
    }
}