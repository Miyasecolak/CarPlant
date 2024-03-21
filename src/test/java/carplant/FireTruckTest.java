package carplant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FireTruckTest {

    @Test
    public void testMakeSignal() {
        FireTruck fireTruck = new FireTruck();
        Assert.assertTrue(fireTruck.makeSignal());
    }

    @Test
    public void testWaterCapacityGreaterThanMinimumWaterCapacity() {
        FireTruck fireTruck = new FireTruck(2, "red", 2000, 2000);
        fireTruck.putOutFire();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testWaterCapacityLessThanMinimumWaterCapacity() {
        FireTruck fireTruck = new FireTruck();
        fireTruck.setWaterCapacity(50);
        fireTruck.putOutFire();
    }

    @Test
    public void testDrive() {
        FireTruck fireTruck = new FireTruck();
        Assert.assertTrue(fireTruck.drive());
    }
}