package liskovSubstitutionPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */

public class Rectangle {

    protected int width;
    protected int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calcArea(){
        return width*height;
    }
}
