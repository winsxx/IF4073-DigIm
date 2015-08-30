package digim.common;

import digim.common.color.Color;

public class ImageMatrix<ColorType extends Color> {
    
    private Color[][] matrix;

    public ImageMatrix(int height, int width) {
        matrix = new Color[height][width];
    }
    
    public void setColor(int row, int col, ColorType color){
        matrix[row][col] = color;
    }
    
    public ColorType getColor(int row, int col){
        return (ColorType) matrix[row][col];
    }
    
}
