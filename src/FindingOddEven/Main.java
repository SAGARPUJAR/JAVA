package FindingOddEven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.print("Enter The Number : ");
        int valueInput=Integer.parseInt(bufferedReader.readLine());
        try{
            if (valueInput%2==0){ System.out.println(valueInput +" is Even !");
            }else{
                System.out.println(valueInput +" is Odd  !");
            }
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
            System.out.println("Invalid Input.. Please Enter valid Number Once again.");
        }
    }
}
