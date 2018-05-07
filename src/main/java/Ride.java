public abstract class Ride {

    private double price;
    private int minAge;
    private int height;

    public Ride(double price, int minAge, int height){
        this.price = price;
        this.minAge = minAge;
        this.height = height;

    }

    public double getPrice(double price) {
        return price;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
