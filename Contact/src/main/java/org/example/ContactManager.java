package org.example;

import java.util.List;

public class ContactManager implements ContactService
{
    private List<Contact> contactList;


    @Override
    public void addContact(Contact contact) {
        if(Validator.isNameValid(contact.getFirstName(),contact.getLastName()) && Validator.isNumberValid(contact.getPhone()))
        {
            contactList.add(contact);
        }
        else
        {
            System.out.println("Invalid");
        }
    }

    @Override
    public void deleteContact(String firstName, String lastName) {

    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public Contact searchContact(String firstName, String lastName) {
        return null;
    }

    @Override
    public void displayContact(SortOption SortOption) {

    }

    @Override
    public void print() {

    }
}
