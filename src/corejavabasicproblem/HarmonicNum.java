package corejavabasicproblem;
import java.util.Scanner;
public class HarmonicNum {
        public static void main(String[] args) {
            System.out.print("Enter number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println();
            System.out.print("The Harmonic Series print  : ");
            double result = 0;
            while(num > 0)
            {
                result = result + (double) 1 / num;
                num--;
                System.out.print(result +"  ");
            }
            System.out.println(" Harmonic Series print  "+result);
        }
    }
