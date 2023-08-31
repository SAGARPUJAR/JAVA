package DivisibleBy3and5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.print("Enter The Limit : ");
        int inputValue=Integer.parseInt(bufferedReader.readLine());
        System.out.println("Divisible by 3..");
        for (int i=1;i<=inputValue;i++){
            if (i%3==0){
                System.out.print("\t"+i);
            }
        }
        System.out.println("");
        System.out.println("Divisible by 5..");
        for (int j=1;j<=inputValue;j++) {
            if (j % 5 == 0) {
                System.out.print("\t" + j);
            }
        }
        System.out.println("");
        System.out.println("Divisible by 3 and 5 : ");
        for (int k=1;k<=inputValue;k++) {
            if (k%3==0 && k%5==0){
                System.out.print("\t"+k);
            }
        }
    }
}
