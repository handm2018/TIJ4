package chapter18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : handongming
 * @date : Created in 2019/8/22 13:42
 * @description: 字节输入流
 * @modified By:
 * @version: 1.0
 */
public class FileIn {

    public static void main(String[] args) throws IOException {
        baseMethod();
        File file = new File("E:/io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(new File("E:/io/2.txt"));

        int b = 0;
        while ((b = fileInputStream.read()) != -1) {
            fos.write(b);
        }
        fileInputStream.close();
        fos.close();


    }

    private static void baseMethod() throws IOException {
        File file = new File("E:/io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
//        int read = fileInputStream.read();
//        System.out.println(read);
//        int read2 = fileInputStream.read();
//        int read3 = fileInputStream.read();
//        System.out.println(read2);
//        System.out.println(read3);

        int b = 0;
        while ((b = fileInputStream.read()) != -1) {
            System.out.println(b);
        }
        fileInputStream.close();
    }


}
