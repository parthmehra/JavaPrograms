package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    Scanner scan = new Scanner(System.in);
    ArrayList<Contact> myContacts = new ArrayList<>();


    public boolean doesContactExist(String name) {
        boolean flag = false;
        for (Contact c : myContacts) {
            if (name.equals(c.getName())) {
                flag = true;
                break;
            }

        }

        return flag;
    }

    public void printContacts() {
        if(myContacts.size()==0){
            System.out.println("There are no contacts to display");
        }
        else {
            for (Contact c : myContacts) {
                System.out.println("Name: " + c.getName());
                System.out.println("Phone number: " + c.getPhoneNumber());
            }
        }
    }

    public void addContact() {
        String name;
        String phoneNumber;
        System.out.println("Enter the name of the contact you want to add");
        name = scan.nextLine();
        if (!doesContactExist(name)) {
            System.out.println("Enter the phone number of the contact you want to add");
            phoneNumber = scan.nextLine();
            Contact c = new Contact(name, phoneNumber);
            myContacts.add(c);
        } else
            System.out.println("The contact already exists. Add a different contact");

    }

    public void updateContact() {
        String name;
        String phoneNumber;
        System.out.println("Enter the name of the contact you want to update");
        name = scan.nextLine();
        for (Contact c : myContacts) {
            if (name.equals(c.getName())) {
                System.out.println("Enter the new number you want to update");
                phoneNumber = scan.nextLine();
                c.setPhoneNumber(phoneNumber);
            }
        }

    }

    public void removeContact() {
        String name;
        boolean flag = false;
        System.out.println("Enter the contact name you want to remove: ");
        name = scan.nextLine();
        for (Contact c : myContacts) {
            if (name.equals(c.getName())) {
                flag = true;
                myContacts.remove(c);
                System.out.println("The contact has been successfully removed");
                break;
            }
        }
        if (!flag) {
            System.out.println("The contact does not exist");
        }

    }

    public void searchContact() {
        String name;
        boolean flag = false;
        System.out.println("Enter the contact name you want to remove: ");
        name = scan.nextLine();
        for (Contact c : myContacts) {
            if (name.equals(c.getName())) {
                flag = true;

                System.out.print("The contact exists and its details are - \n" +
                        "Name : \n" + c.getName() + "Phone number : " + c.getPhoneNumber());
                break;
            }
        }
        if (!flag) {
            System.out.println("The contact does not exist");
        }
    }
}


