package digim.converter;

import digim.common.ImageMatrix;
import digim.common.color.RgbaColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageConverter {

    BufferedImage image;

    public ImageConverter(File file) throws IOException {
        image = ImageIO.read(file);
    }

    public ImageMatrix toImageMatrix(Boolean withAlpha) {
        ImageMatrix imageMatrix;
        imageMatrix = new ImageMatrix<>(image.getWidth(), image.getHeight());
        
        for (int i = image.getMinY(); i < image.getHeight(); ++i) {
            for (int j = image.getMinX(); j < image.getWidth(); ++j) {
                RgbaColor color = new RgbaColor(image.getRGB(j, i));
                imageMatrix.setColor(i, j, color);
            }
        }
        
        return imageMatrix;
    }
    
}