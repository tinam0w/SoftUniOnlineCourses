package ObjectsAndClassesMore.rawData;

public class Tire {
    private double tire1press;
    private int tire1age;
    private double tire2press;
    private int tire2age;
    private double tire3press;
    private int tire3age;
    private double tire4press;
    private int tire4age;

    public Tire(double press1, int age1, double press2, int age2, double press3, int age3, double press4, int age4){
        this.tire1press = press1;
        this.tire1age = age1;
        this.tire2press = press2;
        this.tire2age = age2;
        this.tire3press = press3;
        this.tire3age = age3;
        this.tire4press = press4;
        this.tire4age = age4;
    }

    public boolean isLessThan1(){
        boolean isLess = false;
        if (tire1press < 1)
            isLess = true;
        else
            if (tire2press < 1)
                isLess = true;
            else
                if (tire3press < 1)
                    isLess = true;
                else
                    if(tire4press < 1)
                        isLess = true;

        return isLess;
    }

    public double getTire1press() {
        return tire1press;
    }

    public void setTire1press(double tire1press) {
        this.tire1press = tire1press;
    }

    public int getTire1age() {
        return tire1age;
    }

    public void setTire1age(int tire1age) {
        this.tire1age = tire1age;
    }

    public double getTire2press() {
        return tire2press;
    }

    public void setTire2press(double tire2press) {
        this.tire2press = tire2press;
    }

    public int getTire2age() {
        return tire2age;
    }

    public void setTire2age(int tire2age) {
        this.tire2age = tire2age;
    }

    public double getTire3press() {
        return tire3press;
    }

    public void setTire3press(double tire3press) {
        this.tire3press = tire3press;
    }

    public int getTire3age() {
        return tire3age;
    }

    public void setTire3age(int tire3age) {
        this.tire3age = tire3age;
    }

    public double getTire4press() {
        return tire4press;
    }

    public void setTire4press(double tire4press) {
        this.tire4press = tire4press;
    }

    public int getTire4age() {
        return tire4age;
    }

    public void setTire4age(int tire4age) {
        this.tire4age = tire4age;
    }
}
