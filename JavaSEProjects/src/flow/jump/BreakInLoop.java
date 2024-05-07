package flow.jump;

public class BreakInLoop {
    public static void main(String[] args) {
        // 单层循环
        System.out.println("break in single loop");
        for (int i = 0; i < 10; i++) {
            if (i == 3)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        // nested loop
        System.out.println("break in nested loop");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    break;
                for (int k = 0; k < 3; k++) {
                    if (k == 2)
                        break;
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}
