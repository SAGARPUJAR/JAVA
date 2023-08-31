package ArithmeticOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputValue1,inputValue2;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Please Select Option : ");
        int option=sc.nextInt();
        switch (option){
            case 1:
                System.out.print("Enter Value 1 : ");
                inputValue1=sc.nextInt();
                System.out.print("Enter Value 2 : ");
                inputValue2=sc.nextInt();
                System.out.println("Addition of "+inputValue1 +" and "+inputValue2+" = "+(inputValue1+inputValue2));
                break;
            case 2:
                System.out.print("Enter Value 1 : ");
                inputValue1=sc.nextInt();
                System.out.print("Enter Value 2 : ");
                inputValue2=sc.nextInt();
                System.out.println("Subtraction of "+inputValue1 +" and "+inputValue2+" = "+(inputValue1-inputValue2));
                break;
            case 3:
                System.out.print("Enter Value 1 : ");
                inputValue1=sc.nextInt();
                System.out.print("Enter Value 2 : ");
                inputValue2=sc.nextInt();
                System.out.println("Multiplication of "+inputValue1 +" and "+inputValue2+" = "+(inputValue1*inputValue2));
                break;
            case 4:
                System.out.print("Enter Value 1 : ");
                inputValue1=sc.nextInt();
                System.out.print("Enter Value 2 : ");
                inputValue2=sc.nextInt();
                if (inputValue2==0){
                    System.out.println("0 cannot be divided, Please Enter valid Number");
                    System.out.print("Enter Value 2 : ");
                    inputValue2=sc.nextInt();
                }
                System.out.println("Division of "+inputValue1 +" and "+inputValue2+" = "+(inputValue1/inputValue2));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
