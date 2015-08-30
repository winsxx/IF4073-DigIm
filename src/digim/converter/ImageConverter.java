package digim.converter;

import digim.common.ImageMatrix;
import digim.common.color.RgbaColor;
import java.awt.image.BufferedImage;

public class ImageConverter {
    public void ImageConverter(){
        
    }
    
    public ImageMatrix<RgbaColor> toRgbaImageMatrix(BufferedImage bufferedImage){
        int height = bufferedImage.getHeight();
        int width = bufferedImage.getWidth();
        
        ImageMatrix<RgbaColor> matrix = 
                new ImageMatrix<>(height, width);
        
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                int biColor = bufferedImage.getRGB(j, i);
                RgbaColor color = new RgbaColor();
                color.setA( (biColor>>24) & 0xff );
                color.setR( (biColor>>16) & 0xff );
                color.setG( (biColor>>8)  & 0xff );
                color.setB(  biColor      & 0xff );
            }
        }
    
        return matrix;
    }
}
