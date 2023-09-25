package StringOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main so=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the StringSolution value : ");
        String value=sc.nextLine();
        String result=  so.getStringResult(value);
        System.out.println(result);
    }
    public String getStringResult(String value){
        String returnValue;
        char[] letters=value.toCharArray();
        boolean result=false;
        for (char values:letters){
            result=Character.isDigit(values);
        }
        if (result==true){
            returnValue= "StringSolution is Alphanumeric";
        }
        else{
            returnValue= "StringSolution contains only Alphabets";
        }
        return  returnValue;
    }
}
