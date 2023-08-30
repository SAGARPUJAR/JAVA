package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
    Used to Read the Content from File using FileInputStream Class.
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file.txt");
        System.out.println("File Contains : ");
        int ch;
        while ((ch=fis.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
