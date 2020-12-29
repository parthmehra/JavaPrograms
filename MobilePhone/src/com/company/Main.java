package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone m=new MobilePhone();
        Scanner scan = new Scanner(System.in);
        int ch = 1;

        do {
            System.out.print("1. Print the list of contacts\n" +
                    "2. Add new contact\n" +
                    "3. Update existing contact\n" +
                    "4. Remove Contact\n" +
                    "5. Search/find contact\n" +
                    "6. Exit");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    m.printContacts();
                    break;
                case 2:
                    m.addContact();
                    break;
                case 3:
                    m.updateContact();
                    break;
                case 4:
                    m.removeContact();
                    break;
                case 5:
                    m.searchContact();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;

            }


        } while (ch != 6);

    }

}

