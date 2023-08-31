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
            System.out.println("Enter The String Value To Be Converted to Integer : ");
            values = bufferedReader.readLine();
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace() +"\n Invalid String");
        }
        int result=Integer.parseInt(values);
        System.out.println("String : "+values);
        System.out.println("String Value Converted to Int : "+result);
    }
}
