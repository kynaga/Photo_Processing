package lessons.java;

import lessons.java.utils.ImageUtils;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedImage image = ImageUtils.getImage( "images/cat.png");
        ImageUtils.saveImage(image,"images/cloned_cat.png");
        image.getHeight();
        image.getWidth();
        image.getAlphaRaster();
    }

}