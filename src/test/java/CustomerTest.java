import org.junit.Before;

public class CustomerTest {


    Customer customer1;
    Customer customer2;
    Customer customer3;


    @Before
    public void setUp(){
        customer1 = new Customer(12, 134, 15);
        customer2 = new Customer(10, 127, 20);
        customer3 = new Customer(9, 111, 12);

    }
}
