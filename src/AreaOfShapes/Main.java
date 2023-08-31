package AreaOfShapes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("Find The Area of Below Items : \n1. Rectangle\n2. Square");
        System.out.print("Select the Option : ");
        int input=Integer.parseInt(bufferedReader.readLine());
        switch (input){
            case 1 :
                System.out.print("Enter the Height of Rectangle : ");
                double value1=Double.parseDouble(bufferedReader.readLine());
                System.out.print("Enter the Width of Rectangle : ");
                double value2=Double.parseDouble(bufferedReader.readLine());
                Rectangle rectangle=new Rectangle(value1,value2);
                System.out.println("Area of Rectangle : "+ rectangle.getArea());
                break;
            case 2 :
                System.out.print("Enter the Sides of Square : ");
                double value3=Double.parseDouble(bufferedReader.readLine());
                Square square=new Square(value3);
                System.out.println("Area of Square    : "+ square.getArea());
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
