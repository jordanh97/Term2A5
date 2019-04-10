package domain;

import java.util.ArrayList;

public class User {

    private int userID, dob;
    private ArrayList<Location> recentLocations;

    public int getUserID() {
        return userID;
    }

    public int getDob() {
        return dob;
    }

    public ArrayList<Location> getRecentLocations() {
        return recentLocations;
    }

    private User(Builder builder){
        this.userID = builder.userID;
        this.dob = builder.dob;
        this.recentLocations = builder.recentLocations;

    }

    public static class Builder{

        private ArrayList<Location> recentLocations;
        private int userID, dob;

        public Builder recentLocations(ArrayList<Location> recentLocations){
            this.recentLocations = recentLocations;
            return this;
        }

        public Builder userID(int userID){
            this.userID = userID;
            return this;
        }

        public Builder dob(int dob){
            this.dob = dob;
            return this;
        }

    }

}
