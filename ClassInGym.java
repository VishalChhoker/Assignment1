package CompanyAssignment;

import java.util.HashSet;
import java.util.Set;

public class ClassInGym {
	 private String classId;
	    private String classType;
	    private int maxLimit;
	    private String startTime;
	    private String endTime;
	    private Set<String> bookings;

	    public ClassInGym(String classId, String classType, int maxLimit, String startTime, String endTime) {
	        this.classId = classId;
	        this.classType = classType;
	        this.maxLimit = maxLimit;
	        this.startTime = startTime;
	        this.endTime = endTime;
	        this.bookings = new HashSet<>();
	    }

	    // Getters and Setters for accessing the properties
	    public String getClassId() {
	        return classId;
	    }

	    public String getClassType() {
	        return classType;
	    }

	    public int getMaxLimit() {
	        return maxLimit;
	    }

	    public String getStartTime() {
	        return startTime;
	    }

	    public String getEndTime() {
	        return endTime;
	    }

	    public Set<String> getBookings() {
	        return bookings;
	    }
	}


