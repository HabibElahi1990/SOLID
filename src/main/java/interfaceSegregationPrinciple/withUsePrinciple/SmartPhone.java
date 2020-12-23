package interfaceSegregationPrinciple.withUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class SmartPhone implements PublicTechnology,SpecialTechnology {

    @Override
    public void GPS() {
        System.out.println("SmartPhone has GPS");
    }

    @Override
    public void Radio() {
        System.out.println("SmartPhone has Radio");
    }
}
