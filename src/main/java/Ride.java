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

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean checkIftallEnough(Customer customer){
        return customer.getHeight() >= this.height;
    }

    public boolean checkIfOldEnough(Customer customer){
        return customer.getAge() >= this.minAge;
    }

    public boolean checkIfCustomerHasEnoughMoney(Customer customer){
        return customer.getWallet() >= this.price;
    }


}
