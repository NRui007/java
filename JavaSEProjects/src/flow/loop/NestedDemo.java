package flow.loop;

public class NestedDemo {
    public static void main(String[] args) {
        // nested for loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("=============================");
        int count = 0;
        // nested while and for loop
        while (count < 2) {
            for (int i = 0; i < 3; i++) {
                System.out.println("count=" + count + ", i=" + i);
            }
            count++;
        }
    }
}
