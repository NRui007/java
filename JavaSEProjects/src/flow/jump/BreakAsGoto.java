package flow.jump;

public class BreakAsGoto {
    public static void main(String[] args) {
        firstLayer : {
            SecondLayer : {
                ThirdLayer : {
                    System.out.println("Before the break statement");
                    if (true) {
                        break SecondLayer;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after the second block");
        }
    }
}
