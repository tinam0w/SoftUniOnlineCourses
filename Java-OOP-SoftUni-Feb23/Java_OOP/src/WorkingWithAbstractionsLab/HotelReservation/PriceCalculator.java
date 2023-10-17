package WorkingWithAbstractionsLab.HotelReservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discount) {
        double baePrice = pricePerDay * numberOfDays * season.getMultiplier();

        return baePrice * (1 - discount.getDiscount());
    }
}
