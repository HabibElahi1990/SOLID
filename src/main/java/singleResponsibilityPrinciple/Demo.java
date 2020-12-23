package singleResponsibilityPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
/*
in this demo we show the bad use from object in single Responsibility Principle
* we would better use make a class for a special task
* for example we shouldn't use repository method in a own class
* we make two class UserA and UserB that UserA class illustrate bad class and use all of user Item like
*  relation with DB and validate with properties together .
*  and UserB that show the first Principle
 */
public class Demo {


    public static void main(String[] args) {
        System.out.println("**********************without use single Responsibility Principle***********************************************");
        showUserAMethods();

        System.out.println("**********************with use single Responsibility Principle***********************************************");
        showUserBMethods();
    }

    private static void showUserAMethods() {
        // UserA bad uses of concepts
        UserA userA = new UserA();
        userA.setFirstName("Java");
        userA.setLastName("SOLID");

        //userA class just get value and set them but this class can validate and save so it is wrong
        userA.validateUserA(userA);
        userA.saveUserA(userA);
    }

    private static void showUserBMethods() {
        // UserB good uses of concepts
        // userB class just get value and set them
        UserB userb = new UserB();
        userb.setFirstName("Java");
        userb.setLastName("SOLID");

        // use another class for validate
        UserBValidate userBValidate = new UserBValidate();
        userBValidate.validateUserB(userb);

        // use another class for relation with DB
        UserBRepository userBRepository = new UserBRepository();
        userBRepository.updateUserB(userb);

    }
}
