package corejavabasicproblem;
import java.util.Scanner;
public class FlipCoin {

        public static void main(String[] args) {
            System.out.println("Enter flip the coin..");
            Scanner scan = new Scanner(System.in);
            int flip = scan.nextInt();
            scan.close();
            getFlipDetails(flip);
        }
        public static void getFlipDetails(int flip) {
            int headCount = 0 ;
              int tailCount = 0;
            float  headPer , tailPer;
            for (int i =1; i <= flip; i++)
            {
                float Flipcoin = (float) Math.random();
                if (Flipcoin > 0.5)
                {
                    headCount++;
                    System.out.println("Flip Head");
                }
                else
                {
                    tailCount++;
                    System.out.println("Flip Tail");
                }
            }
             headPer = (float) headCount / flip * 100;
            System.out.println("Total Head count : "+headCount+"\nAnd the percentage is : "+headPer+" %");
            tailPer = (float) tailCount/flip*100;
            System.out.println("Total Tail count : "+tailCount+"\nAnd the percentage is : "+tailPer+" %");
        }
    }