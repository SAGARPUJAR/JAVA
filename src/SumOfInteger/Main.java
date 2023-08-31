package SumOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader inputStreamReader =new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        int value1,value2,value3;
        System.out.print("Enter The 1 Value : ");
        value1=Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter The 2 Value : ");
        value2=Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter The 3 Value : ");
        value3=Integer.parseInt(bufferedReader.readLine());
        int result=(value1 + value2);
        System.out.println("the Sum of "+value1 +" and "+value2+" is : "+result);
        if (value3==result){
            System.out.println("the Sum of "+value1 +" and "+value2 +" is Equal to "+value3);
        }else{
            System.out.println("the Sum of "+value1 +" and "+value2 +" = " +(result)+ " and is Not Equal to "+value3);
        }
    }
}
