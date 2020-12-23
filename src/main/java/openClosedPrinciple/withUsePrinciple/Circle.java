package openClosedPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Circle implements Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return this.radius*2*Math.PI;
    }
}
