package Phone;

import java.util.*;
import java.util.stream.*;

public class Phonebook {
    private final String id;
    private String name;
    private final List<Contact> contacts = new ArrayList<>();

    public Phonebook(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean removeContactById(String contactId) {
        return contacts.removeIf(contact -> contact.getId().equals(contactId));
    }

    public Optional<Contact> findContactById(String contactId) {
        return contacts.stream().filter(contact -> contact.getId().equals(contactId)).findFirst();
    }

    public List<Contact> searchByName(String query) {
        String lower = query.toLowerCase();
        return contacts.stream()
                .filter(contact -> contact.getFullName().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }

    public List<Contact> getContacts() { return Collections.unmodifiableList(contacts); }
}
