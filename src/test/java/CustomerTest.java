import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {


    Customer customer1;
    Customer customer2;
    Customer customer3;
    Rollercoaster rollercoaster;


    @Before
    public void setUp(){
        customer1 = new Customer(12, 134, 15);
        customer2 = new Customer(10, 127, 20);
        customer3 = new Customer(9, 111, 12);

    }

    @Test
    public void canGetAge(){
        assertEquals(12, customer1.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(134, customer1.getHeight());
    }

    @Test
    public void wallet(){
        assertEquals(15, customer1.getWallet(), 0.01);
    }

    @Test
    public void payWallet(){
        rollercoaster = new Rollercoaster(4, 9, 120);
        customer1.payforPrice(rollercoaster);
        assertEquals(11, customer1.getWallet(), 0.01);
    }

}



