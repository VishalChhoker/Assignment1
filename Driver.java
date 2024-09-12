package CompanyAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Driver {
	private Map<String, Customer> customers;
    private Admin admin;

    public Driver() {
        this.customers = new HashMap<>();
        this.admin = new Admin();
    }

    // Book class for customer
    public String bookClass(String customerId, String gymId, String classId) {
        Customer customer = customers.getOrDefault(customerId, new Customer(customerId));
        customers.putIfAbsent(customerId, customer);

        Gym gym = admin.getGyms().get(gymId);
        if (gym != null) {
            ClassInGym gymClass = gym.getGymClasses().get(classId);
            if (gymClass != null && gymClass.getBookings().size() < gymClass.getMaxLimit()) {
                String bookingId = UUID.randomUUID().toString();
                gymClass.getBookings().add(bookingId);
                Booking booking = new Booking(bookingId, gymId, classId);
                customer.getBookings().put(bookingId, booking);
                return bookingId;
            }
        }
        return null;
    }

    // Get all bookings for customer
    public List<String> getAllBookings(String customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            return new ArrayList<>(customer.getBookings().keySet());
        }
        return Collections.emptyList();
    }

    // Cancel booking
    public void cancelBooking(String bookingId, String customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            customer.getBookings().remove(bookingId);
        }
    }

    public static void main(String[] args) {
        Driver driver = new Driver();

        // Admin functionality
        String gymId = driver.admin.addGym("Gym1", "Patel Nagar", 100);
        String classId = driver.admin.addClass(gymId, "cardio", 20, "6:00", "7:00");

        // Customer functionality
        String bookingId = driver.bookClass("customer1", gymId, classId);
        System.out.println("Booking successful: " + bookingId);

        // Get all bookings
        System.out.println("All bookings: " + driver.getAllBookings("customer1"));

        // Cancel a booking
        driver.cancelBooking(bookingId, "customer1");
        System.out.println("All bookings after cancellation: " + driver.getAllBookings("customer1"));
    }

}
