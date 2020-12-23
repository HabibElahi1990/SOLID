package singleResponsibilityPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class UserBRepository {

    public void saveUserB(UserB userB){
        System.out.println("save user B : "+ userB.toString());
    }

    public void updateUserB(UserB userB){
        System.out.println("update user B : "+ userB.toString());
    }

    public void deleteUserB(){
        System.out.println("delete user B ");
    }
}
