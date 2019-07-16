package ReadAgain.设计模式.结构型.Proxy;

import java.net.URL;


/**
 * 代理：控制其他对象的访问
 *
 */
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
