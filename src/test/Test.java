package test;
import org.opencv.core.*;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;


public class Test {


    static {
        // 载入opencv的库
        String opencvpath = System.getProperty("user.dir") + "\\lib\\";
        String opencvDllName = opencvpath + Core.NATIVE_LIBRARY_NAME + ".dll";
        System.load(opencvDllName);
    }

    public static final String xmlfilePath = "D:opencv\\opencv\\sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml";
    //
//检测输入图像中的人脸，将最大的脸保存到指定的输出文件中
//

    public static double calcArea(Rect rect) {
        return rect.width * rect.height;
    }


    /**
     * opencv实现人脸识别
     * @param imagePath
     * @param outFile
     * @throws Exception
     */
    public static void detectFace(String imagePath, String outFile) throws Exception {

        System.out.println("Running DetectFace ... ");
        // 从配置文件lbpcascade_frontalface.xml中创建一个人脸识别器，该文件位于opencv安装目录中
        CascadeClassifier faceDetector = new CascadeClassifier(
                "D:\\opencv\\opencv\\sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml");

        Mat image = Imgcodecs.imread(imagePath);

        // 在图片中检测人脸
        MatOfRect faceDetections = new MatOfRect();

        faceDetector.detectMultiScale(image, faceDetections);

        System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));

        Rect[] rects = faceDetections.toArray();
        if (rects != null && rects.length > 1) {
            // 找出最大的1张脸
            Rect maxRect = new Rect(0, 0, 0, 0);
            //throw new RuntimeException("超过一个脸");
            for (Rect rect : faceDetections.toArray()) {
                if (calcArea(maxRect) < calcArea(rect)) {
                    maxRect = rect;
                }
            }
            if (calcArea(maxRect) > 0) {
                //创建人脸拷贝区域
                Mat roi_img = new Mat(image, maxRect);
                //创建临时的人脸拷贝图形
                Mat tmp_img = new Mat();
                //人脸拷贝
                roi_img.copyTo(tmp_img);
            }
        }
        // 在每一个识别出来的人脸周围画出一个方框
        Rect rect = rects[0];
        Imgproc.rectangle(image, new Point(rect.x - 150, rect.y - 200),
                new Point(rect.x + rect.width + 150, rect.y + rect.height + 200),
                new Scalar(0, 255, 0));
        Imgcodecs.imwrite(outFile, image);//这里是输出原图并划框

        imageCut(imagePath, "C:\\Users\\Administrator\\Desktop\\12.jpg", rect.x - 150, rect.y - 200, rect.width + 250, rect.height + 300);//进行图片裁剪
        System.out.println(String.format("人脸识别成功，人脸图片文件为： %s", outFile));


    }


    /**
     * 裁剪图片并重新装换大小
     * @param imagePath
     * @param posX
     * @param posY
     * @param width
     * @param height
     * @param outFile
     */
    public static void imageCut(String imagePath, String outFile, int posX, int posY, int width, int height) {

        //原始图像
        Mat image = Imgcodecs.imread(imagePath);

        //截取的区域：参数,坐标X,坐标Y,截图宽度,截图长度
        Rect rect = new Rect(posX, posY, width, height);

        //两句效果一样
        Mat sub = image.submat(rect);   //Mat sub = new Mat(image,rect);

        Mat mat = new Mat();
        Size size = new Size(width/2, height/2);
       Imgproc.resize(sub, mat, size);//将人脸进行截图并保存

        Imgcodecs.imwrite(outFile, mat);
        System.out.println(String.format("图片裁切成功，裁切后图片文件为： %s", outFile));

    }

    /**
     * 图片合成
     * @param image1
     * @param image2
     * @param posw
     * @param posh
     * @param outFile
     * @return
     */
    public static void simpleMerge(String image1, String image2, int posw, int posh, String outFile) throws IOException {

        // 获取底图
        BufferedImage buffImg1 = ImageIO.read(new File(image1));

        // 获取层图
        BufferedImage buffImg2 = ImageIO.read(new File(image2));

        //合并两个图像
        int w1 = buffImg1.getWidth();
        int h1 = buffImg1.getHeight();

        int w2 = buffImg2.getWidth();
        int h2 = buffImg2.getHeight();

        BufferedImage imageSaved = new BufferedImage(w1, h1, BufferedImage.TYPE_INT_ARGB); //创建一个新的内存图像

        Graphics2D g2d = imageSaved.createGraphics();

        g2d.drawImage(buffImg1, null, 0, 0);  //绘制背景图像

        for (int i = 0; i < w2; i++) {
            for (int j = 0; j < h2; j++) {
                int rgb1 = buffImg1.getRGB(i + posw, j + posh);
                int rgb2 = buffImg2.getRGB(i, j);

            /*if (rgb1 != rgb2) {
                rgb2 = rgb1 & rgb2;
            }*/
                imageSaved.setRGB(i + posw, j + posh, rgb2); //修改像素值
            }
        }

        ImageIO.write(imageSaved, "png", new File(outFile));

        System.out.println(String.format("图片合成成功，合成图片文件为： %s", outFile));

    }

    public static void main(String[] args) throws Exception {
        detectFace("C:\\Users\\Administrator\\Desktop\\upload\\22.jpg", "C:\\Users\\Administrator\\Desktop\\11.jpg");//人脸识别并截图
    }
}
