package Streams;

import java.io.FileWriter;
import java.io.IOException;
/*
    Writing the content to file using File Writer.
*/
public class WriteFile {
    public static void main(String[] args) throws IOException {
        String str="WELCOME TO CHRIST UNIVERSITY.";
        FileWriter fw=new FileWriter("FileWriter.txt");
        fw.write(str);
        fw.close();
    }
}
