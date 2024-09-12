package CompanyAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Admin {
	private Map<String, Gym> gyms;

    public Admin() {
        this.gyms = new HashMap<>();
    }

    // Add gym
    public String addGym(String name, String location, int maxAccommodation) {
        String gymId = UUID.randomUUID().toString();
        Gym gym = new Gym(gymId, name, location, maxAccommodation);
        gyms.put(gymId, gym);
        return gymId;
    }

    // Remove gym
    public void removeGym(String gymId) {
        gyms.remove(gymId);
    }

    // Add class to gym
    public String addClass(String gymId, String classType, int maxLimit, String startTime, String endTime) {
        Gym gym = gyms.get(gymId);
        if (gym != null && gym.getGymClasses().size() < gym.getMaxAccommodation()) {
            String classId = UUID.randomUUID().toString();
            ClassInGym gymClass = new ClassInGym(classId, classType, maxLimit, startTime, endTime);
            gym.getGymClasses().put(classId, gymClass);
            return classId;
        }
        return null;
    }

    // Remove class from gym
    public void removeClass(String gymId, String classId) {
        Gym gym = gyms.get(gymId);
        if (gym != null) {
            gym.getGymClasses().remove(classId);
        }
    }

    public Map<String, Gym> getGyms() {
        return gyms;
    }

}
