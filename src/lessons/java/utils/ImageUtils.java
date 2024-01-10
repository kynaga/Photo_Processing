package lessons.java.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    static public BufferedImage getImage(String path) throws IOException {
        final File file = new File (path);
        return ImageIO.read(file);
    }

    static public void saveImage(BufferedImage image, String path) throws IOException {
        ImageIO.write(image, "png", new File(path));
    }

}
