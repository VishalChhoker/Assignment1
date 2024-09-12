package CompanyAssignment;

import java.util.HashMap;
import java.util.LinkedList;

public class Question2 {
	
	// Entry class to hold key value pair
    static class Entry {
        Object key;
        Object value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    // The size of the hash map (bucket array)
    private final int SIZE = 16;
    private LinkedList<Entry>[] map;

    // Constructor to initialize the map (array of linked lists)
    public Question2() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate the index
    private int getIndex(Object key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Put method to add key-value pairs
    public void put(Object key, Object value) {
        int index = getIndex(key);
        LinkedList<Entry> entries = map[index];

        // Check if the key already exists
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update the value if the key exists
                return;
            }
        }

        // If the key does not exist, add a new Entry
        entries.add(new Entry(key, value));
    }

    // Get method to retrieve value by key
    public Object get(Object key) {
        int index = getIndex(key);
        LinkedList<Entry> entries = map[index];

        // Iterate through the linked list at this index
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value; // Return value if key matches
            }
        }

        // If the key is not found, return null
        return null;
    }

    public static void main(String[] args) {
        HashMap myMap = new HashMap();
        
        // Adding key-value pairs
        myMap.put("name", "Vishal");
        myMap.put(10, 1000);
        myMap.put(20, 2000);
        
        // Retrieving values
        System.out.println("name: " + myMap.get("name"));
        System.out.println("key 10: " + myMap.get(10));
        System.out.println("key 20: " + myMap.get(20));
        System.out.println("key 30 (not found): " + myMap.get(30));  // Key not in map
    }
}




