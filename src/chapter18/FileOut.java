package chapter18;

import java.io.*;

/**
 * @author : handongming
 * @date : Created in 2019/8/22 10:54
 * @description: 字节输出流
 * @modified By:
 * @version: 1.0
 */
public class FileOut {

    public static void main(String[] args) {
        writeMethod();
        IOExceptionTemplate();

    }

    /**
     * 演示：IO异常处理通用模板
     * 问题1：如果在写出数据时，抛出异常，那么流无法关闭！无论是否有异常，流的关闭都必须执行
     *     解决：我们必须把关闭的动作放到finally中去。
     * 问题2：关闭动作本身也有异常，所以也必须try起来
     * 问题3：如果创建流的时候，就抛出了异常，那么流为null，没必要关！
     *     解决：我们要在关闭之前，判断一下是否为null
     * 问题4：如果有多个流，在finally中，要对每个流的关闭单独try
     */
    private static void IOExceptionTemplate() {
        FileOutputStream fileOutputStream1 = null;
        FileOutputStream fileOutputStream2 = null;

        try {
            fileOutputStream1 = new FileOutputStream(new File("E:/io/a.txt"));
            fileOutputStream1 = new FileOutputStream(new File("E:/io/1.txt"));

            fileOutputStream1.write(37);

        } catch (FileNotFoundException e) {
            System.out.println("目标文件不存在");
        } catch (IOException e) {
            System.out.println("IO异常");
        } finally {
            try {
                if (fileOutputStream1 != null) {
                    fileOutputStream1.close();
                }
            } catch (IOException e) {
                System.out.println("流关闭异常");
            }
            try {
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (IOException e) {
                System.out.println("流关闭异常");
            }
        }
    }

    private static void writeMethod() {
        File dest = new File("E:/io/a.txt");
        try {
            //public FileOutputStream(File file,boolean append) throws FileNotFoundException
            // 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处
            OutputStream outputStream = new FileOutputStream(dest, true);
            byte[] b = new String("ceuisl").getBytes();
            //获取系统匹配的分行符。Linux系统是/n,windows系统是/r/n...
            String s = System.lineSeparator();

            //public void write(byte[] b) throws IOException  将 b.length 个字节从指定 byte 数组写入此文件输出流中
            outputStream.write(b);
            outputStream.write(s.getBytes());
            outputStream.write("zksui".getBytes());

            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
