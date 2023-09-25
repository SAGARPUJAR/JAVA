package StringToInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws  NumberFormatException, IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String values="";
        try {
            System.out.println("Enter The StringSolution Value To Be Converted to Integer : ");
            values = bufferedReader.readLine();
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace() +"\n Invalid StringSolution");
        }
        int result=Integer.parseInt(values);
        System.out.println("StringSolution : "+values);
        System.out.println("StringSolution Value Converted to Int : "+result);
    }
}
