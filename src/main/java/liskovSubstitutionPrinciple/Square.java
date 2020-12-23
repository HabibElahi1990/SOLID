package liskovSubstitutionPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
/*
In this class we don't  have any property and we use two methods from superclass
if we want to follow liskov Substitution Principle we shouldn't change superclass method's behaviors
but we Override setHeight method and chang it . as a result we break this principle.
for resolve this problem we can use another method for setting value
 */
public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setWidthAndHeight(){
        super.setWidth(width);
        super.setHeight(width);
    }
}
