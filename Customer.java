package CompanyAssignment;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private String customerId;
    private Map<String, Booking> bookings;

    public Customer(String customerId) {
        this.customerId = customerId;
        this.bookings = new HashMap<>();
    }

    // Getters and Setters for accessing the properties
    public String getCustomerId() {
        return customerId;
    }

    public Map<String, Booking> getBookings() {
        return bookings;
    }

}
