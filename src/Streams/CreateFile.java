package Streams;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*Used to Create a File
* User Need to Enter the values and saving data to file.
* DataInputStream : To take input.
* FileOutPutStream : Which is File method used to add or Create a file
* */
public class CreateFile {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream=new DataInputStream(System.in);
        FileOutputStream fileOutputStream=new FileOutputStream("file.txt");
        System.out.println("Enter the details to insert into File add ! end of the file to end.");
        char ch;
        while ((ch=(char) dataInputStream.read())!='!'){
            fileOutputStream.write(ch);
        }
        System.out.println("File Written Successfully..");
        fileOutputStream.close();
    }
}
