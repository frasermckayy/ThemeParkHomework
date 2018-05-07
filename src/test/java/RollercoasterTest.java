import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp(){
        rollercoaster = new Rollercoaster(10, 11, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(10, rollercoaster.getPrice(), 0.01);
    }


}
