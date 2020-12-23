package interfaceSegregationPrinciple.withoutUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class SmartPhone implements Technology{
    @Override
    public void GPS() {
        System.out.println("SmartPhone has GPS");
    }

    @Override
    public void Radio() {
        System.out.println("SmartPhone has Radio");
    }
}
