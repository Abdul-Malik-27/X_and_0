import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicTac ticTac = new TicTac();
        boolean c = true;
        int num1, num2;
        while (c) {
            System.out.println(ticTac.makeMove(num1 = sc.nextInt(), num2 = sc.nextInt()));
            String[][] array = ticTac.getField();
            for (String[] a : array) {
                for (String b : a) {
                    System.out.print(b + " ");
                }
                System.out.println();
            }
            if (ticTac.makeMove(num1, num2).equals("Game was ended")) {
                ticTac = new TicTac();
            } else if (ticTac.makeMove(num1, num2).equals("Player X won") && ticTac.makeMove(num1, num2).equals("Player 0 won")) {
                ticTac = new TicTac();
            }

        }
    }
}