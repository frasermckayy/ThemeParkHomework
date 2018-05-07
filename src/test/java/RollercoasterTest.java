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

    @Test
    public void canGetminAge(){
        assertEquals(11, rollercoaster.getMinAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(120, rollercoaster.getHeight());
    }


}
