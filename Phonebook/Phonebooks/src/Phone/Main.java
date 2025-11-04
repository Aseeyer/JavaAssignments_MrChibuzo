package Phone;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Phonebooks manager = FileHandler.loadPhonebooks();

        while (true) {
            System.out.println("\n1. Create phonebook");
            System.out.println("2. Add contact to phonebook");
            System.out.println("3. View phonebooks");
            System.out.println("4. Search contact");
            System.out.println("5. Delete contact");
            System.out.println("6. Delete phonebook");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter phonebook name: ");
                String phoneBookName = scanner.nextLine();
                manager.createPhonebook(phoneBookName);
                FileHandler.savePhonebooks(manager);
                System.out.println("Phonebook created.");
            } else if (choice == 2) {
                System.out.print("Enter phonebook name: ");
                String pbName = scanner.nextLine();
                Optional<Phonebook> phonebookOption = manager.findByName(pbName);
                if (phonebookOption.isPresent()) {
                    Phonebook phonebook = phonebookOption.get();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    Contact contact = new Contact(firstName, lastName);

                    while (true) {
                        System.out.print("Enter phone number (or type 'done'): ");
                        String phone = scanner.nextLine();
                        if (phone.equalsIgnoreCase("done")) break;
                        contact.addPhonesNumber(phone);
                    }

                    phonebook.addContact(contact);
                    FileHandler.savePhonebooks(manager);
                    System.out.println("Contact added.");
                } else {
                    System.out.println("Phonebook not found.");
                }
            } else if (choice == 3) {
                for (Phonebook phonebook : manager.getAll()) {
                    System.out.println("Phonebook: " + phonebook.getName());
                    for (Contact c : phonebook.getContacts()) {
                        System.out.println(" - " + c.getFullName() + " | " + c.getPrimaryPhone());
                    }
                }
            } else if (choice == 4) {
                System.out.print("Enter phonebook name to search in: ");
                String phonebookName = scanner.nextLine();
                Optional<Phonebook> phonebookOption = manager.findByName(phonebookName);
                if (phonebookOption.isPresent()) {
                    Phonebook phonebook = phonebookOption.get();
                    System.out.print("Enter name to search: ");
                    String query = scanner.nextLine();
                    List<Contact> results = phonebook.searchByName(query);
                    if (results.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        for (Contact contact : results) {
                            System.out.println(contact.getFullName() + " | " + contact.getPrimaryPhone());
                        }
                    }
                } else {
                    System.out.println("Phonebook not found.");
                }
            } else if (choice == 5) {
                System.out.print("Enter phonebook name: ");
                String pbName = scanner.nextLine();
                Optional<Phonebook> phonebookOption = manager.findByName(pbName);
                if (phonebookOption.isPresent()) {
                    Phonebook phonebook = phonebookOption.get();
                    System.out.print("Enter full name of contact to delete: ");
                    String name = scanner.nextLine();
                    List<Contact> results = phonebook.searchByName(name);
                    if (!results.isEmpty()) {
                        for (Contact contact : results) {
                            phonebook.removeContactById(contact.getId());
                        }
                        FileHandler.savePhonebooks(manager);
                        System.out.println("Contact(s) deleted.");
                    } else {
                        System.out.println("No contact found with that name.");
                    }
                } else {
                    System.out.println("Phonebook not found.");
                }
            } else if (choice == 6) {
                System.out.print("Enter phonebook name to delete: ");
                String phonebookName = scanner.nextLine();
                Optional<Phonebook> phonebookOption = manager.findByName(phonebookName);
                if (phonebookOption.isPresent()) {
                    manager.deletePhonebookById(phonebookOption.get().getId());
                    FileHandler.savePhonebooks(manager);
                    System.out.println("Phonebook deleted.");
                } else {
                    System.out.println("Phonebook not found.");
                }
            } else if (choice == 7) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        System.out.println("Goodbye!");
    }
    public static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
