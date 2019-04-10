package factory;


import domain.Location;
import util.Misc;

public class LocationFactory {

    public static Location getLocation(String locationID) {
        return new Location.Builder().locationID(Misc.generateId())
                .locationID(locationID)
                .build();
    }

}
