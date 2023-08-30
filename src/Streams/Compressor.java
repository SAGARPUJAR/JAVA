package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class Compressor {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("file.txt");
        FileOutputStream fos=new FileOutputStream("file2");
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);
        int data;
        while((data=fis.read())!=-1){
            dos.write(data);
        }
    }
}
