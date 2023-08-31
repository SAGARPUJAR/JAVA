package Largestof2Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        int value1,value2;
        System.out.println("Find Largest of 2 numbers : ");
        System.out.print("Enter the value 1 : ");
        value1=Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter the value 2 : ");
        value2=Integer.parseInt(bufferedReader.readLine());
        if (value1>value2){
            System.out.println(value1 +" is Greater Than "+value2);
        }else if(value2>value1){
            System.out.println(value2 +" is Greater Than "+value1);
        }else{
            System.out.println(value1 + " and "+value2 +" are equal.");
        }
    }
}
