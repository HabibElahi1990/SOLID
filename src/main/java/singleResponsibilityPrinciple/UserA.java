package singleResponsibilityPrinciple;

/**
 * Created by h.elahi on Dec, 2020
 */
public class UserA {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void saveUserA(UserA userA){
        System.out.println("save user A : "+ userA.toString());
}

    public void updateUserA(UserA userA){
        System.out.println("update user A : "+ userA.toString());
    }

    public void deleteUserA(){
        System.out.println("delete user A ");
    }

    public boolean validateUserA(UserA userA){
        if (userA.getFirstName().equals("") || userA.getLastName().equals("")){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "UserA{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
