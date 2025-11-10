package data.models;

public enum Offence {
    ONE_WAY(1000),
    DRUNK_DRIVING(5000),
    NO_SEAT_BELT(2000),
    OVER_SPEEDING(3000);

    private final double charge;

    Offence(double charge) {
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    @Override
    public String toString() {
        return name().replace('_', ' ');
    }
}
