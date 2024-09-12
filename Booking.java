package CompanyAssignment;

public class Booking {
	  private String gymId;
	    private String classId;
		private String bookingId;

	    public Booking(String bookingId, String gymId, String classId) {
	        this.bookingId = bookingId;
	        this.gymId = gymId;
	        this.classId = classId;
	    }

	    // Getters and Setters for accessing the properties
	    public String getBookingId() {
	        return bookingId;
	    }

	    public String getGymId() {
	        return gymId;
	    }

	    public String getClassId() {
	        return classId;
	    }

}
