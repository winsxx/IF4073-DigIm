package digim.analytics;

import digim.common.ImageMatrix;
import digim.common.color.Color;

public class ImageColorAnalyzer {
    public long distinctColorCount(ImageMatrix image){
        long imageWidth = image.getWidth();
        long imageHeight = image.getHeight();
        long imageSize = imageWidth*imageHeight;

        // Bubble Sort Ascending
        for(int i=0; i<imageSize-1; i++) {
        	for(int j=i+1; j<imageSize; j++) {
        		Color iColor = image.getColor(i/imageWidht, i%imageWidth);
        		Color jColor = image.getColor(j/imageWidth, j%imageWidth);
        		
        		Integer iColorValue = iColor.getColor();
        		Integer jColorValue = jColor.getColor();

        		if( iColorValue.compare(jColorValue) > 0 ){
        			// swap value
        			Color iNewColor = new Color(jColorValue.intValue());
					Color jNewColor = new Color(iColorValue.intValue());  			

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
