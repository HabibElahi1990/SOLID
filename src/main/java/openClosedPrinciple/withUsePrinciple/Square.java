package openClosedPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Square implements Shape {

    private int lenght;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calcArea() {
        return this.lenght*2;
    }
}
