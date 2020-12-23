package interfaceSegregationPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Demo {

    // with separating interfaces we use Interface Segregation Principle
    // we use PublicTechnology and SpecialTechnology
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.GPS();
        smartPhone.Radio();

        Car car = new Car();
        car.Radio();

    }
}
