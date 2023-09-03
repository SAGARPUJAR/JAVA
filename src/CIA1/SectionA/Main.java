package CIA1.SectionA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("Arithmetic Operation : \n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n");
        System.out.println("Select the Operation to be performed : ");
        int optionValue=0;
        do {
            try{
                optionValue=Integer.parseInt(bufferedReader.readLine());
            }catch (Exception ex){
                if (optionValue==0){
                    System.out.println("OOP's Invalid input Please Enter Valid Data to Process");
                }
            }
        }while (optionValue==0);

        switch (optionValue){
            case 1:
                int input1=0,input2=0;
                do{
                    try{
                        System.out.print("Enter the Value 1 : ");
                        input1=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input1==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 1");
                        }
                    }
                }while (input1==0);
                do{
                    try{
                        System.out.print("Enter the Value 2 : ");
                        input2=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input2==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 2");
                        }
                    }
                }while (input2==0);
                System.out.println("Addition of "+input1 +" and "+input2+" is : "+(input1+input2));
                break;
            case 2:
                int input1S=0,input2S=0;
                do{
                    try{
                        System.out.println("Enter the Value 1 : ");
                        input1S=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input1S==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 1");
                        }
                    }
                }while (input1S==0);
                do{
                    try{
                        System.out.print("Enter the Value 2 : ");
                        input2S=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input2S==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 2");
                        }
                    }

                }while (input2S==0);

                System.out.println("Subtraction of "+input1S +" and "+input2S+" is : "+(input1S+input2S));
                break;
            case 3:
                int input1D=0,input2D=0;
                do{
                    try{
                        System.out.println("Enter the Value 1 : ");
                        input1D=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input1D==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 1");
                        }
                    }
                }while (input1D==0);
                do{
                    try{
                        System.out.print("Enter the Value 2 : ");
                        input2D=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input2D==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 2");
                        }
                    }
                }while (input2D==0);
                System.out.println("Division of "+input1D +" and "+input2D+" is : "+(input1D+input2D));
                break;
            case 4 :
                int input1M=0,input2M=0;
                do{
                    try{
                        System.out.println("Enter the Value 1 : ");
                        input1M=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input1M==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 1");
                        }
                    }
                }while (input1M==0);
                do{
                    try{
                        System.out.print("Enter the Value 2 : ");
                        input2M=Integer.parseInt(bufferedReader.readLine());
                    }catch (Exception ex){
                        if (input2M==0){
                            System.out.println("Invalid Input, Please Enter Valid Input 2");
                        }
                    }
                }while (input2M==0);

                System.out.println("Multiplication of "+input1M +" and "+input2M+" is : "+(input1M+input2M));
                break;
            default:
                System.out.println("Invalid input..");
                System.exit(0);
        }
    }
}
