package com.bridgelab;
import java.util.Scanner;

public class Main {
    private void option() {
        boolean status = true;
        Scanner scan = new Scanner(System.in);
        //creat object
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        /* To print option to perform
         * Choice to print add display method

         */
        while (status) {
            System.out.println("Enter your option :  \n press1 to add new person" + "\n press 2 tov add display details \n prss  9 to Quit");
            int choice = scan .nextInt();
            switch (choice) {
                case 1:
                    addressBookSystem.add();
                    break;
                case 2 :
                    addressBookSystem.display();
                    break;
                default:
                    status = false;

                    
            }
        }

    }
    /* Main method to call optios8*/
    public static void main(String args[]) {
        Main main = new main(0);
        main.option();


    }
}