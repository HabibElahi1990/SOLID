package singleResponsibilityPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class UserBValidate {

    public boolean validateUserB(UserB userB){
        if (userB.getFirstName().equals("") || userB.getLastName().equals("")){
            return false;
        }

        return true;
    }
}
