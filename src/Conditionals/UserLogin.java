package Conditionals;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("enter username: ");
        userName = input.nextLine();

        System.out.print("enter password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("1234")) {

            System.out.println("correct, logged in");

        }
        else {
            System.out.println("wrong username or password");
            System.out.println("1-reset my password\n2-exit");
            System.out.print("Would you like to reset your password: ");
            int select = input.nextInt();
            input.nextLine();

            switch (select) {

                case 1:
                    System.out.print("enter new password:");
                    newPassword=input.nextLine();
                    if(newPassword.equals("1234")){
                        System.out.println("new password cannot be the same as the old one");
                    }
                    else{
                        System.out.println("password is reset");
                    }
                    break;

                case 2:
                    System.out.println("logged out");
                    break;

                default:
                    System.out.println("choose any option");
            }
        }
    }
}
