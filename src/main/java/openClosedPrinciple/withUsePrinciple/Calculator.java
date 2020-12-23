package openClosedPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Calculator {

    // we have to use instanceof for get area but id we want to add another class  we must change this code
    public double calculatorArea(Shape shape) {
        return shape.calcArea();
    }
}
