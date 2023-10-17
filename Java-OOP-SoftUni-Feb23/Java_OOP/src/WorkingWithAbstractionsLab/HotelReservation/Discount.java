package WorkingWithAbstractionsLab.HotelReservation;

public enum Discount {
    VIP(0.2), SecondVisit(0.1), None(0);

    private final double discount;
    private Discount(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
