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

    @Test
    public void drinkWaterReducesVolumeBy10(){
        waterBottle.drinkWater();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void drinkWaterTwiceReducesVolumeBy20(){
        waterBottle.drinkWater();
        waterBottle.drinkWater();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void emptyBottleMakesVolumeZero(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }
}
