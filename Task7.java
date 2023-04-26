
//Write a  program that takes three numbers as input to calculate and print the average of the numbers

import java.util.Scanner;
public class Task7 {
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3=sc.nextInt();

        double avg=(num1+num2+num3)/3;
        System.out.println("Average of three numbers is : "+avg);
    }
    
}
