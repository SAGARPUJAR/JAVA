package Streams;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZip {
    static  int BUFFER=1024;
    public static void main(String[] args) throws IOException {
        zipFile();
    }
    private static void zipFile() {
        ZipOutputStream zos = null;
        BufferedInputStream bis = null;
        try {
            String fileName = "file.txt";
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis, BUFFER);
            FileOutputStream fos = new FileOutputStream("demo.zip");
            zos = new ZipOutputStream(fos);
            ZipEntry ze = new ZipEntry(file.getName());
            zos.putNextEntry(ze);
            //zos.putNextEntry(ze1);
            byte data[] = new byte[BUFFER];
            int count;
            while((count = bis.read(data, 0, BUFFER)) != -1) {
                zos.write(data, 0, count);
            }
        }
        catch(IOException ioExp) {
            System.out.println("Error while zipping " + ioExp.getMessage());
        }
        finally
        {
            if(zos != null) {
                try {
                    zos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(bis != null) {
                try {
                    bis.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
