import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }
}
