package com.bridgelab;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookSystem  implements Info{
    // Arraylist Declare
    ArrayList<Person>book= new ArrayList<>();
    // create scanner class object
    Scanner scan = new Scanner(System.in);
    public void add() {
        // user input to print the details
        System.out.println("Enter the Firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the Lastname: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the Addrss :");
        String address = scan.nextLine();
        System.out.println("Enter the city: ");
        String city = scan.nextLine();
        System.out.println("Enter the State: ");
        String state = scan.nextLine();
        System.out.println("enter the phonumber: ");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter the Zip code: ");
        scan.nextLine();
        String zip = scan.nextLine();
        Person person = new Person(firstName, lastName, address, city, state, phoneNumber, zip);
        book.add(person);
        System.out.println("Successfully Add...");

    }
        /* Method to edit or update the details using first name*/
           public viod edit (String firstName) {
               for ( int search = 0; search<book.size(); search++ ) {
                   if (book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                       Person person = book.get(search);
                       System.out.println("Hey "+person.getFirstName()+"Please edit your details");
                       System.out.println("Hey" +person.getFirstName()+ "Please edit your address");
                       scan.next();
                       String address = scan.nextLine();
                       person.setAddress(address);
                       System.out.println("Hey "+person.getFirstName()+"Please edit your city");
                       String city = scan.nextLine();
                       person.setCity(city);
                       System.out.println("Hey"+person.getFirstName()+"please edit your state");
                       String state = scan.next();
                       person.setState(state);
                       System.out.println("hey "+person.getFirstName()+"Please edit your phone number");
                       long phone = scan.nextLong();
                       System.out.println("Hey "+person.getFirstName() +"Please edit your zip");
                       scan.next();
                       String zip = scan.nextLine();
                       person.setZip(zip);
                       System.out.println("Hey "+person.getFirstName()+"Successfully you have update your details. ");
                   }
               }
           }
           /* Method to delete the details using firstname*/
           public void delete(String firstName) {
               for (int select = 0; select < book.size();select++) {
                   if (book.get(select).getFirstName().equalsIgnoreCase(firstName)) {
                       Person person = book.get(select);
                       book.remove(person);
                       System.out.println("Successfully Deleted");

                   }
               }
           }
           //Display the person details added
        public void display() {
            for (Person person1 : book)
                System.out.println(person1);
        }
    }





