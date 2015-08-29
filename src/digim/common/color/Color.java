package digim.common.color;

public abstract class Color {
    private Integer color;
    
    /**
     * @return the color
     */
    public Integer getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Integer color) {
        this.color = color;
    }
    
    @Override
    public abstract String toString();
    
}
