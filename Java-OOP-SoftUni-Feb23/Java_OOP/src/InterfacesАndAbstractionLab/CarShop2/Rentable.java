package InterfacesАndAbstractionLab.CarShop2;

public interface Rentable extends Car{
    int getMinRentDay();

    double getPricePerDay();

    //метод от Банкин:
    default double getPricePerDays(int days){
        if (days < getMinRentDay()){
            String message = String.format("cannot rent %s car for less than %d days", getModel(), getMinRentDay());
            throw new IllegalStateException(message);
        }

        return days * getPricePerDay();
    }
}
