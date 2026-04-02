import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * A console-based Java application that simulates how a railway system 
 * manages a train's consist, which is a collection of bogies attached to an engine.
 */
public class TrainConsistApp {
    
    // ArrayList to store bogies dynamically
    private List<String> bogies;
    
    /**
     * Constructor - Initialize empty ArrayList for bogies
     */
    public TrainConsistApp() {
        this.bogies = new ArrayList<>();
    }
    
    /**
     * Display welcome message
     */
    public void displayWelcomeMessage() {
        System.out.println("=== Train Consist Management App ===");
    }
    
    /**
     * Display the initial consist summary
     */
    public void displayConsistSummary() {
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println("Train consist initialized successfully.");
    }
    
    /**
     * Add a passenger bogie to the train
     * @param bogie The passenger bogie type to add (e.g., "Sleeper", "AC Chair", "First Class")
     */
    public void addPassengerBogie(String bogie) {
        bogies.add(bogie);
        System.out.println("✓ Added: " + bogie);
    }
    
    /**
     * Remove a bogie from the train
     * @param bogie The bogie to remove
     * @return true if bogie was removed, false if not found
     */
    public boolean removeBogie(String bogie) {
        if (bogies.remove(bogie)) {
            System.out.println("✓ Removed: " + bogie);
            return true;
        } else {
            System.out.println("✗ Bogie not found: " + bogie);
            return false;
        }
    }
    
    /**
     * Check if a bogie exists in the train
     * @param bogie The bogie to search for
     * @return true if bogie exists, false otherwise
     */
    public boolean containsBogie(String bogie) {
        return bogies.contains(bogie);
    }
    
    /**
     * Display all bogies in the train consist
     */
    public void displayBogies() {
        System.out.println("\n--- Current Train Consist ---");
        if (bogies.isEmpty()) {
            System.out.println("No bogies in train.");
        } else {
            System.out.println("Total bogies: " + bogies.size());
            for (int i = 0; i < bogies.size(); i++) {
                System.out.println((i + 1) + ". " + bogies.get(i));
            }
        }
    }
    
    /**
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of TrainConsistApp
        TrainConsistApp app = new TrainConsistApp();
        
        // Display welcome message
        app.displayWelcomeMessage();
        
        // UC1: Display initial consist summary
        app.displayConsistSummary();
        
        // UC2: Add passenger bogies to train (ArrayList CRUD Operations)
        System.out.println("\n--- Adding Passenger Bogies ---");
        app.addPassengerBogie("Sleeper");
        app.addPassengerBogie("AC Chair");
        app.addPassengerBogie("First Class");
        
        // Display bogies after insertion
        app.displayBogies();
        
        // Remove a bogie from the train
        System.out.println("\n--- Removing a Bogie ---");
        app.removeBogie("AC Chair");
        
        // Display bogies after removal
        app.displayBogies();
        
        // Check if a bogie exists using contains()
        System.out.println("\n--- Checking Bogie Existence ---");
        String searchBogie = "Sleeper";
        if (app.containsBogie(searchBogie)) {
            System.out.println("✓ \"" + searchBogie + "\" exists in train consist.");
        } else {
            System.out.println("✗ \"" + searchBogie + "\" does not exist in train consist.");
        }
        
        String searchBogie2 = "AC Chair";
        if (app.containsBogie(searchBogie2)) {
            System.out.println("✓ \"" + searchBogie2 + "\" exists in train consist.");
        } else {
            System.out.println("✗ \"" + searchBogie2 + "\" does not exist in train consist.");
        }
    }
}
