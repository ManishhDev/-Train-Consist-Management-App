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
     * Main method - Entry point of the application
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of TrainConsistApp
        TrainConsistApp app = new TrainConsistApp();
        
        // Display welcome message
        app.displayWelcomeMessage();
        
        // Display initial consist summary
        app.displayConsistSummary();
    }
}
