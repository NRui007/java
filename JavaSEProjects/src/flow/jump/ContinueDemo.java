package flow.jump;

public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("continue in for loop");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("continue in while loop");
        int num = 0;
        while (num < 10) {
            num++;
            if (num % 2 == 1) {
                continue;
            }
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("continue in do-while loop");
        do {
            num--;
            if (num % 3 != 0) {
                continue;
            }
            System.out.print(num + " ");
        } while (num > 0);
        System.out.println();

        System.out.println("continue in nested loop");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j)
                    continue;
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
