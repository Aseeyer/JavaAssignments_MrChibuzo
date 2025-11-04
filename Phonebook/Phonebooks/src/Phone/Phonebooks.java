package Phone;

import java.util.*;

public class Phonebooks {
    private final List<Phonebook> phonebooks = new ArrayList<>();

    public Phonebook createPhonebook(String name) {
        Phonebook p = new Phonebook(name);
        phonebooks.add(p);
        return p;
    }

    public boolean deletePhonebookById(String id) {
        return phonebooks.removeIf(p -> p.getId().equals(id));
    }

    public Optional<Phonebook> findByName(String name) {
        return phonebooks.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
    }

    public List<Phonebook> getAll() { return Collections.unmodifiableList(phonebooks); }
}
