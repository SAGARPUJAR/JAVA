package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Numbers to Be Displayed : ");
        System.out.print("Enter Starting Value : ");
        int startValue=sc.nextInt();
        System.out.print("Enter Ending Value : ");
        int endValue=sc.nextInt();

        System.out.println("For Loop : ");
        for (int i=startValue;i<=endValue;i++){
            System.out.print(i +"\t");
        }
        System.out.println("");
        System.out.println("While Loop : ");
        while (startValue<=endValue){
            System.out.print(startValue+"\t");
            startValue++;
        }
        System.out.println("");
        System.out.println("Do While Loop");
        do{
            System.out.println(startValue);
            startValue++;
        }while (startValue<endValue);
    }
}
