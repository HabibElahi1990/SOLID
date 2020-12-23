package openClosedPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Demo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Shape square=new Square();
        ((Square) square).setLenght(10);
        System.out.println(calculator.calculatorArea(square));

        Shape circle=new Circle();
        ((Circle) circle).setRadius(14);
        System.out.println(calculator.calculatorArea(circle));
    }
}
