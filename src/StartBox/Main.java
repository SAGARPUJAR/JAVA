package StartBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows,column;
        System.out.print("Enter the Rows Count : ");
        rows=sc.nextInt();
        System.out.print("Enter the Columns Count : ");
        column=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=column;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
