package liskovSubstitutionPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class Demo {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        System.out.println(rectangle.calcArea());

        Square square=new Square();
        square.setWidth(3);
        System.out.println(square.calcArea());
    }
}
