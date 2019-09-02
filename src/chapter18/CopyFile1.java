package chapter18;

import java.io.*;

/**
 * @author : handongming
 * @date : Created in 2019/9/2 16:38
 * @desc :
 */
public class CopyFile1 {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("E:/io/pic/34.jpg");
        OutputStream out = new FileOutputStream("D:/io/34c.jpg");

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1){
            out.write(buf,0,len);
        }

        in.close();
        out.close();

    }
}
