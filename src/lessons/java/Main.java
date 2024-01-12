package lessons.java;

import lessons.java.functions.FilterOperation;
import lessons.java.utils.ImageUtils;
import lessons.java.utils.RgbMaster;

import java.awt.image.BufferedImage;


public class Main {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage( "images/cat.png");
        final RgbMaster rgbMaster = new RgbMaster(image);
        rgbMaster.changeImage(FilterOperation:: sepia);
        ImageUtils.saveImage(rgbMaster.getImage(),"images/cloned_cat.png");
    }
}