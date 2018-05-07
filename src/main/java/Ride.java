public abstract class Ride {

    private double price;
    private int minAge;
    private int height;

    public Ride(double price, int minAge, int height){
        this.price = price;
        this.minAge = minAge;
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getHeight() {
        return height;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
