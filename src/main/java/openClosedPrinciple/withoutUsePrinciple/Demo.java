package openClosedPrinciple.withoutUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Demo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Square square=new Square();
        square.setLenght(10);
        System.out.println(calculator.calculatorArea(square));

        Circle circle=new Circle();
        circle.setRadius(5);
        System.out.println(calculator.calculatorArea(circle));
    }
}
