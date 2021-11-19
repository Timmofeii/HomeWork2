import java.security.PublicKey;

public class HomeWork2 {
    public static void main(String[] args) {
        within10and20();
        isPositiveNegative();
        trueOrFalse();
        printWordAndRimes();

    }
    public static void within10and20() {
        int a = 1;
        int b = 9;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }


    private static void isPositiveNegative() {
        int c = 3;
        if (c >= 0) {
            System.out.println("Число позитивное");
        } else {
            System.out.println("Число негативное ");

        }

    }
    private static boolean trueOrFalse() {
        int a = -1;
        if (a < 0) {
            return true;

        } else {
        }
        return false;
    }
    public static void printWordAndRimes() {
        for ( int i = 0; i < 5; i++) {
            System.out.println("Указанная строка");
        }
    }

}




