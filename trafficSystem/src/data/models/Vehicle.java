package data.models;

import java.sql.Array;
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
    private List<Ticket> tickets;

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
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", owner=" + owner.getOwnerName() +
                ", ticketsCount=" + tickets.size() +
                '}';
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }


}
