package Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
    Reading the Content of file using FileReader
*/
public class ReadFiles {
    public static void main(String[] args) throws IOException {
        FileReader fr=null;
        try{
            fr=new FileReader("file.txt");
        }catch (FileNotFoundException ex){
            System.out.println("File Not Found");
            System.exit(0);
        }
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
