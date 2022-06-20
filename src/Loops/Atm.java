package Loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Enter username: ");
            userName = input.nextLine();
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Hello, welcome to Kodluyoruz Bank!");
                do {

                    System.out.println("1-Deposit Money\n2-Withdraw Money\n3-Inquire About Balance\n4-Exit");
                    System.out.print("Please select the action you want to do: ");
                    select = input.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Amount of money: ");
                            int depositPrice = input.nextInt();
                            balance += depositPrice;
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            int withdrawPrice = input.nextInt();

                            if (withdrawPrice > balance){
                                System.out.println("Insufficient Balance.");
                            }else {
                                balance -= withdrawPrice;
                                break;
                            }
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                    }

                }while (select != 4);
                System.out.println("See you later.");
                break;

            }else {
                right --;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0){
                    System.out.println("Your account has been blocked. Please contact the bank.");
                }else {
                    System.out.println("You remaining right: " + right);
                }
            }
        }
    }
}
