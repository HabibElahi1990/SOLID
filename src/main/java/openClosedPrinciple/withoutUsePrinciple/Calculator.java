package openClosedPrinciple.withoutUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Calculator {

    // we have to use instanceof for get area but id we want to add another class  we must change this code
    public double calculatorArea(Object shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).getRadius() * 2 * Math.PI;
        } else if (shape instanceof Square) {
            return ((Square) shape).getLenght() * 2;
        }
        return 0d;
    }
}
