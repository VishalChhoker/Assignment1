package CompanyAssignment;

import java.util.HashMap;
import java.util.Map;

public class Gym {
	private String gymId;
    private String name;
    private String location;
    private int maxAccommodation;
    private Map<String, ClassInGym> gymClasses;

    public Gym(String gymId, String name, String location, int maxAccommodation) {
        this.gymId = gymId;
        this.name = name;
        this.location = location;
        this.maxAccommodation = maxAccommodation;
        this.gymClasses = new HashMap<>();
    }

    // Getters and Setters for accessing the properties
    public String getGymId() {
        return gymId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxAccommodation() {
        return maxAccommodation;
    }

    public Map<String, ClassInGym> getGymClasses() {
        return gymClasses;
    }

}
