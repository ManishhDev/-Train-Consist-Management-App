/**
 * Bogie Class - Represents a railway bogie (car) with properties
 * UC7: Custom objects with Comparator for sorting
 */
public class Bogie {
    
    private String name;
    private int capacity;
    private String type; // Passenger or Cargo
    
    /**
     * Constructor to create a bogie with name, capacity, and type
     * @param name The bogie name (e.g., "Sleeper", "AC Chair")
     * @param capacity The seating/load capacity
     * @param type The bogie type (Passenger or Cargo)
     */
    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
    
    /**
     * Get the bogie name
     * @return name of the bogie
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the bogie name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the bogie capacity
     * @return capacity value
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Set the bogie capacity
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Get the bogie type
     * @return bogie type (Passenger or Cargo)
     */
    public String getType() {
        return type;
    }
    
    /**
     * Set the bogie type
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * toString method for displaying bogie information
     * @return bogie details as string
     */
    @Override
    public String toString() {
        return "Bogie{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
