package interfaceSegregationPrinciple.withoutUsePrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */

/*
* car don't have GPS but in order to it implements PublicTechnology , it have to implements GPS method
* so with this method we break Interface Segregation Principle
 */
public class Car implements Technology{
    @Override
    public void GPS() {

    }

    @Override
    public void Radio() {
        System.out.println("Car has Radio");
    }
}
