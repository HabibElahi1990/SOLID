package interfaceSegregationPrinciple.withoutUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Demo {

    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.GPS();
        smartPhone.Radio();

        Car car=new Car();
        // car can have not GPS but in order to it can use GPS method and call it
        car.GPS();
        car.Radio();

    }
}
