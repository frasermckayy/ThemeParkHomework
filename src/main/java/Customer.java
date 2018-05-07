public class Customer {

    private int age;
    private int height;
    private double wallet;
    Customer customer;


    public Customer(int age, int height, double wallet) {
        this.age = age;
        this.height = height;
        this.wallet = wallet;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void payforPrice(Ride ride) {
        this.wallet -= ride.getPrice();
    }



}