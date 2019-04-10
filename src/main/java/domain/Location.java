package domain;

import java.util.Objects;

public class Location {

    private String locationID;
    private String coords;
    private int expires;

    private Location(){}

    public String getLocationID() {
        return locationID;
    }

    public String getCoords() {
        return coords;
    }

    public int getExpires() {
        return expires;
    }

    private Location(Builder builder){
        this.locationID = builder.locationID;
        this.coords = builder.coords;
        this.expires = builder.expires;

    }

    public static class Builder{

        private String coords, locationID;
        private int expires;

        public Builder coords(String coords){
            this.coords = coords;
            return this;
        }

        public Builder locationID(String locationID){
            this.locationID = locationID;
            return this;
        }

        public Builder expires(int expires){
            this.expires = expires;
            return this;
        }

        public Location build() {
            return new Location(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return locationID == location.locationID &&
                expires == location.expires &&
                Objects.equals(coords, location.coords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationID, coords, expires);
    }
    
}
