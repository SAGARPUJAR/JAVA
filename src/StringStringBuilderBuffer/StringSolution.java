package StringStringBuilderBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSolution {
    public static void main(java.lang.String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter Your Name : ");
        java.lang.String name = bufferedReader.readLine();
        System.out.println("StringSolution : "+name);

        //StringSolution Builder : is a helper Class
        StringBuilder stringBuilder=new StringBuilder(name);
        stringBuilder.append(", Welcome to Christ");
        System.out.println("StringSolution Builder : "+stringBuilder);

        //StringSolution Buffer
        StringBuffer stringBuffer=new StringBuffer(name);
        stringBuffer.append(" hellow...");
        System.out.println("StringSolution Buffer : "+ stringBuffer);
    }
}
