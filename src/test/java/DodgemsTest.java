import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {


    Dodgems dodgems;

    @Before
    public void setUp() {
        dodgems = new Dodgems(15, 10, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(10, dodgems.getPrice(), 0.01);
    }

    @Test
    public void canGetminAge(){
        assertEquals(11, dodgems.getMinAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(120, dodgems.getHeight());
    }
}
