package corejavabasicproblem;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.print("Enter the Year: ");
        int year;
        try (Scanner sc = new Scanner(System.in))
        {
            year = sc.nextInt();
        }
        if (year>=1900)
        {
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println("Specified year: "+year+" is a leap year");
            else
                System.out.println("Specified year: "+year+" is not a leap year");
        }
        else
        {
            System.out.println("Provise a valid Georgian Calender Year.");
        }

    }
    }


