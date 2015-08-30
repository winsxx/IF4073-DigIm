package digim.analytics;

import digim.common.ImageMatrix;
import digim.common.color.Color;
import digim.common.color.RgbColor;

public class ImageColorAnalyzer {
    public long distinctColorCount(ImageMatrix image){
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        int imageSize = imageWidth*imageHeight;

        // Bubble Sort Ascending
        for(int i=0; i<imageSize-1; i++) {
        	for(int j=i+1; j<imageSize; j++) {
        		Color iColor = image.getColor(i/imageWidth, i%imageWidth);
        		Color jColor = image.getColor(j/imageWidth, j%imageWidth);
        		
        		int iColorValue = iColor.getColor();
        		int jColorValue = jColor.getColor();

        		if( iColorValue > jColorValue ){
        			// swap value
        			Color iNewColor = new RgbColor(jColorValue);
				Color jNewColor = new RgbColor(iColorValue);  			

        			image.setColor(i/imageWidth, i%imageWidth, iNewColor);
        			image.setColor(j/imageWidth, j%imageWidth, jNewColor);
        		}
        	}
        }

        // Different Pixel Counting
        // if the pixel if first pixel, increase result
        // else if the pixel is different with previous pixel, increase result
        long result = 0;
        for(int i=0; i<imageSize; i++) {
        	if(i==0) {
        		result += 1;
        	}
        	else{
        		int j = i-1;
        		Color iColor = image.getColor(i/imageWidth, i%imageWidth);
        		Color jColor = image.getColor(j/imageWidth, j%imageWidth);

        		Integer iColorValue = iColor.getColor();
        		Integer jColorValue = jColor.getColor();
        		
        		if( !iColorValue.equals(jColorValue) ) {
        			result += 1;
        		}
        	}
        }

        return result;
    }
}
