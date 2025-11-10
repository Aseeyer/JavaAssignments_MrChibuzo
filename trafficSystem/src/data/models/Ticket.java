package data.models;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Offence offence;
    private boolean hasPaid;
    private Officer issuer;
    private LocalDateTime dateOfBooking;
    private LocalDateTime dateOfPayment;

    public Ticket(int id, Vehicle vehicle, Offence offence, Officer issuer, LocalDateTime dateOfBooking, LocalDateTime dateOfPayment) {
        this.id = id;
        this.vehicle = vehicle;
        this.offence = offence;
        this.issuer = issuer;
        this.dateOfBooking = dateOfBooking;
        this.hasPaid = false;
        this.dateOfPayment = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Offence getOffence() {
        return offence;
    }

    public void setOffence(Offence offence) {
        this.offence = offence;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public void moneyHasBeenPaid(LocalDateTime paymentDate) {
        this.dateOfPayment = paymentDate;
        this.hasPaid = true;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", vehiclePlate='" + vehicle.getPlateNumber() + '\'' +
                ", offence=" + offence +
                ", hasPaid=" + hasPaid +
                ", issuer='" + issuer.getOfficerName() + '\'' +
                ", dateOfBooking=" + dateOfBooking +
                ", dateOfPayment=" + dateOfPayment +
                '}';
    }
}
