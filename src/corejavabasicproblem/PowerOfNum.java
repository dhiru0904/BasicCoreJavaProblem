package corejavabasicproblem;
import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println("Enter number Powers of 2: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0 && num < 31) {
            for (int i = 0; i <= num; i++) {
                if (i == 0)

                    System.out.println("2 POWER " + i + " = 1");
                else
                    System.out.println("2 POWER " + i + " = " + (int) Math.pow(2, i));
            }
        }
    }
}