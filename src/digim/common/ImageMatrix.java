package digim.common;

import digim.common.color.Color;

public class ImageMatrix<ColorType extends Color> {

    private final ColorType[][] matrix;

    @SuppressWarnings("unchecked")
    public ImageMatrix(int width, int height) {
        matrix = (ColorType[][]) new Object[height][width];
    }

    public void setColor(int row, int col, ColorType colorType) {
        matrix[row][col] = colorType;
    }

    public ColorType getColor(int row, int col) {
        return matrix[row][col];
    }
    
}