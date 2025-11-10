package data.models;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private int id;
    private String name;
    private String model;
    private Year year;
    private String color;
    private String plateNumber;
    private Owner owner;
    private final List<Ticket> tickets;

    public Vehicle(int id, String name, String model, String color) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.tickets = new ArrayList<>();
    }

    public Vehicle(int id, String name, String model, Year year, String color, String plateNumber, Owner owner) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
        this.plateNumber = plateNumber;
        this.owner = owner;
        this.tickets = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets.clear();
        if (tickets != null) {
            this.tickets.addAll(tickets);
        }
    }

    public void addTicket(Ticket ticket) {
        if (ticket != null) {
            this.tickets.add(ticket);
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + (name != null ? name : "N/A") + '\'' +
                ", model='" + (model != null ? model : "N/A") + '\'' +
                ", year=" + (year != null ? year : "N/A") +
                ", color='" + (color != null ? color : "N/A") + '\'' +
                ", plateNumber='" + (plateNumber != null ? plateNumber : "N/A") + '\'' +
                ", owner=" + (owner != null ? owner.getOwnerName() : "N/A") +
                ", ticketsCount=" + tickets.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }
}
