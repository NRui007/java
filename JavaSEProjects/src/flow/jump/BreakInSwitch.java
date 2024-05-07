package flow.jump;

public class BreakInSwitch {
    public static void main(String[] args) {
        int n = 2;
        // 不使用break中断switch语句
        switch (n) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }

        System.out.println("=========================");
        // 使用break中断switch语句
        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }
}
