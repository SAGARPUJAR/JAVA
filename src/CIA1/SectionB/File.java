package CIA1.SectionB;

import java.io.*;

public class File {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        //Creating File
        try{
            FileWriter fileWriter=new FileWriter("example.txt",false);
            System.out.print("Enter the Values to Store in the file : ");
            String value=bufferedReader.readLine();
            fileWriter.write(value);
            fileWriter.close();
            System.out.println("Data Inserted Successfully..");
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
        }

        // reading Data from the file
        try{
            FileReader fileReader=new FileReader("example.txt");
            int ch;
            while ((ch=fileReader.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println();
            System.out.println("Data Found..");
        }catch (FileNotFoundException ex){
            System.out.println("File Not Found, Please Provide Valid File Name");
        }
    }
}
