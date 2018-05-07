import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacupTest {

    Teacups teacups;

    @Before
    public void setUp() {
        teacups = new Teacups(15, 10, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(15, teacups.getPrice(), 0.01);
    }

    @Test
    public void canGetminAge(){
        assertEquals(10, teacups.getMinAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(120, teacups.getHeight());
    }
}
