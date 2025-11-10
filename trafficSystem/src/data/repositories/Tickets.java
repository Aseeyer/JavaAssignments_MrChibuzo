package data.repositories;

import data.models.Ticket;
import exceptions.IdNotFoundException;
import exceptions.InvalidObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tickets implements TicketsRepository {
    private int count;
    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public Ticket save(Ticket ticket) {
        Objects.requireNonNull(ticket, "ticket must not be null");
        tickets.add(ticket);
        count++;
        return ticket;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        throw new IdNotFoundException("Ticket with id " + id + " not found");
    }

    @Override
    public List<Ticket> findAll() {
        return new ArrayList<>(tickets);
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == id) {
                tickets.remove(i);
                count--;
                return;
            }
        }
        throw new IdNotFoundException("Ticket with id " + id + " not found");
    }

    @Override
    public int getSize() {
        return tickets.size();
    }

    @Override
    public void deleteAll() {
        tickets.clear();
        count = 0;
    }

    @Override
    public Ticket delete(Ticket ticket) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket found = tickets.get(i);
            if (found.equals(ticket)) {
                tickets.remove(i);
                count--;
                return found;
            }
        }
        throw new InvalidObject("Ticket not found for deletion");
    }

    @Override
    public long count() {
        return count;
    }
}