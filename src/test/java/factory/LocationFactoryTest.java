package factory;

import domain.Location;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationFactoryTest {

    @Test
    public void getCourse() {

        String name = "BeachFront 1022230294003112";
        Location c = LocationFactory.getLocation(name);
        System.out.println(c);
        Assert.assertNotNull(c.getLocationID());
    }
}