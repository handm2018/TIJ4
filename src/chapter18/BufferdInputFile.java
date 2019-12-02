package chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : handongming
 * @date : Created in 2019/9/12 下午2:06
 * @desc :
 */
public class BufferdInputFile {

    public static String read(String fileName) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine())!=null){
            sb.append(s+"\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.printf(read("CopyFile1.class"));
    }
}
