package JavaAdvanced.definingClasses.carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    private List<String> parts;

    //конструктор:
    public Car(){
        this.parts = new ArrayList<>();
    }

    public Car(String brand, String model, int horsePower){
        this(); //викаме първия конструктор //винаги на първо място
                //overload-ване
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        //this.parts = new ArrayList<>();
    }

    public Car(String brand){
        this(brand, "unknown", -1);
    }

    //getter: this е излишен тук
    public String getBrand(){
        return brand;
    }

    //setter:
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(int newPower){
        this.horsePower = newPower;
    }

    public String carInfo(){
        return this.toString(); //this ни сава гаранция, че метода toString е от този клас, ане външен
    }


    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }

    @Override
    public int hashCode() {
        return this.brand.length() + this.model.length() + this.horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

}
