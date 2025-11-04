package Phone;

import java.io.*;
import java.util.*;

public class FileHandler {

    private static final String FILE_PATH = "phonebooks.txt";

    public static void savePhonebooks(Phonebooks manager) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Phonebook phonebook : manager.getAll()) {
                writer.write("PHONEBOOK:" + phonebook.getName());
                writer.newLine();
                for (Contact contact : phonebook.getContacts()) {
                    writer.write(contact.getFirstName() + "," + contact.getLastName() + "," + contact.getPhonesNumbers().toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error saving phonebooks: " + e.getMessage());
        }
    }

    public static Phonebooks loadPhonebooks() {
        Phonebooks manager = new Phonebooks();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            Phonebook currentPhonebook = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("PHONEBOOK:")) {
                    String pbName = line.split(":")[1];
                    currentPhonebook = manager.createPhonebook(pbName);
                } else if (!line.isEmpty() && currentPhonebook != null) {
                    String[] parts = line.split(",", 3);
                    if (parts.length >= 3) {
                        Contact contact = new Contact(parts[0], parts[1]);
                        String phonesRaw = parts[2].replace("[", "").replace("]", "");
                        for (String phone : phonesRaw.split(", ")) {
                            contact.addPhonesNumber(phone);
                        }
                        currentPhonebook.addContact(contact);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error loading phonebooks: " + e.getMessage());
        }
        return manager;
    }
}
