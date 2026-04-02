import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Train Consist Management App
 * A console-based Java application that simulates how a railway system 
 * manages a train's consist, which is a collection of bogies attached to an engine.
 */
public class TrainConsistApp {
    
    // ArrayList to store bogies dynamically
    private List<String> bogies;
    
    // HashSet to store unique bogie IDs (UC3)
    private Set<String> uniqueBogieIDs;
    
    // LinkedList to maintain ordered train consist (UC4)
    private LinkedList<String> orderedConsist;
    
    // LinkedHashSet to maintain insertion order with uniqueness (UC5)
    private LinkedHashSet<String> orderedFormation;
    
    /**
     * Constructor - Initialize ArrayList, HashSet, LinkedList, and LinkedHashSet
     */
    public TrainConsistApp() {
        this.bogies = new ArrayList<>();
        this.uniqueBogieIDs = new HashSet<>();
        this.orderedConsist = new LinkedList<>();
        this.orderedFormation = new LinkedHashSet<>();
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
     * Add a bogie ID to the unique set (UC3)
     * Automatically handles deduplication
     * @param bogieID The unique bogie ID to add
     */
    public void addUniqueBogieID(String bogieID) {
        if (uniqueBogieIDs.add(bogieID)) {
            System.out.println("✓ Added Bogie ID: " + bogieID);
        } else {
            System.out.println("⚠ Duplicate Bogie ID ignored: " + bogieID);
        }
    }
    
    /**
     * Display all unique bogie IDs in the train (UC3)
     * HashSet stores elements in unordered manner
     */
    public void displayUniqueBogieIDs() {
        System.out.println("\n--- Unique Bogie IDs (HashSet) ---");
        if (uniqueBogieIDs.isEmpty()) {
            System.out.println("No bogie IDs registered.");
        } else {
            System.out.println("Total unique bogie IDs: " + uniqueBogieIDs.size());
            int count = 1;
            for (String id : uniqueBogieIDs) {
                System.out.println(count + ". " + id);
                count++;
            }
        }
    }
    
    /**
     * Get the count of unique bogie IDs
     * @return Number of unique IDs
     */
    public int getUniqueBogieIDCount() {
        return uniqueBogieIDs.size();
    }
    
    // ========== UC4: LinkedList Operations ==========
    
    /**
     * Add a bogie to the end of the ordered consist (UC4 - addLast)
     * @param bogie The bogie to add at the end
     */
    public void addBogieToEnd(String bogie) {
        orderedConsist.addLast(bogie);
        System.out.println("✓ Added to END: " + bogie);
    }
    
    /**
     * Add a bogie to the beginning of the ordered consist (UC4 - addFirst)
     * @param bogie The bogie to add at the beginning
     */
    public void addBogieToBeginning(String bogie) {
        orderedConsist.addFirst(bogie);
        System.out.println("✓ Added to BEGINNING: " + bogie);
    }
    
    /**
     * Insert a bogie at a specific position in the ordered consist (UC4 - add at index)
     * @param index Position to insert (0-based)
     * @param bogie The bogie to insert
     */
    public void insertBogieAtPosition(int index, String bogie) {
        try {
            orderedConsist.add(index, bogie);
            System.out.println("✓ Inserted at position " + index + ": " + bogie);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("✗ Invalid position: " + index);
        }
    }
    
    /**
     * Remove the first bogie from the consist (UC4 - removeFirst)
     * @return The removed bogie, or null if empty
     */
    public String removeFirstBogie() {
        if (orderedConsist.isEmpty()) {
            System.out.println("✗ Cannot remove - consist is empty");
            return null;
        }
        String removed = orderedConsist.removeFirst();
        System.out.println("✓ Removed from BEGINNING: " + removed);
        return removed;
    }
    
    /**
     * Remove the last bogie from the consist (UC4 - removeLast)
     * @return The removed bogie, or null if empty
     */
    public String removeLastBogie() {
        if (orderedConsist.isEmpty()) {
            System.out.println("✗ Cannot remove - consist is empty");
            return null;
        }
        String removed = orderedConsist.removeLast();
        System.out.println("✓ Removed from END: " + removed);
        return removed;
    }
    
    /**
     * Display the ordered train consist (UC4)
     * LinkedList maintains insertion order like a physical train
     */
    public void displayOrderedConsist() {
        System.out.println("\n--- Ordered Train Consist (LinkedList) ---");
        if (orderedConsist.isEmpty()) {
            System.out.println("Train consist is empty.");
        } else {
            System.out.println("Total bogies in consist: " + orderedConsist.size());
            for (int i = 0; i < orderedConsist.size(); i++) {
                System.out.println((i + 1) + ". " + orderedConsist.get(i));
            }
        }
    }
    
    /**
     * Get the number of bogies in the ordered consist
     * @return Size of the consist
     */
    public int getConsistSize() {
        return orderedConsist.size();
    }
    
    // ========== UC5: LinkedHashSet Operations - Preserve Insertion Order with Uniqueness ==========
    
    /**
     * Attach a bogie to the ordered formation (UC5 - LinkedHashSet)
     * LinkedHashSet maintains insertion order AND enforces uniqueness
     * @param bogie The bogie type to attach
     */
    public void attachBogieToFormation(String bogie) {
        if (orderedFormation.add(bogie)) {
            System.out.println("✓ Attached to formation: " + bogie);
        } else {
            System.out.println("⚠ Duplicate bogie ignored: " + bogie + " (already in formation)");
        }
    }
    
    /**
     * Display the ordered train formation in attachment sequence (UC5)
     * LinkedHashSet returns elements in insertion order, preserving physical sequence
     */
    public void displayOrderedFormation() {
        System.out.println("\n--- Ordered Train Formation (LinkedHashSet) ---");
        if (orderedFormation.isEmpty()) {
            System.out.println("Formation is empty.");
        } else {
            System.out.println("Total unique bogies in formation: " + orderedFormation.size());
            int position = 1;
            for (String bogie : orderedFormation) {
                System.out.println(position + ". " + bogie);
                position++;
            }
        }
    }
    
    /**
     * Get the size of the ordered formation
     * @return Number of unique bogies in formation
     */
    public int getFormationSize() {
        return orderedFormation.size();
    }
    
    /**
     * Check if a bogie exists in the formation
     * @param bogie The bogie to search for
     * @return true if bogie is in formation
     */
    public boolean isInFormation(String bogie) {
        return orderedFormation.contains(bogie);
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
        
        // UC3: Track Unique Bogie IDs (HashSet - Set Interface)
        System.out.println("\n--- Adding Unique Bogie IDs (HashSet) ---");
        app.addUniqueBogieID("BG101");
        app.addUniqueBogieID("BG102");
        app.addUniqueBogieID("BG103");
        
        // Display unique bogie IDs after insertion
        app.displayUniqueBogieIDs();
        
        // Attempt to add duplicate IDs (automatic deduplication)
        System.out.println("\n--- Attempting to Add Duplicate Bogie IDs ---");
        app.addUniqueBogieID("BG101");  // Duplicate
        app.addUniqueBogieID("BG102");  // Duplicate
        app.addUniqueBogieID("BG104");  // New ID
        
        // Display unique bogie IDs after deduplication attempt
        app.displayUniqueBogieIDs();
        
        // UC4: Maintain Ordered Bogie IDs (LinkedList - Order Preservation)
        System.out.println("\n--- Building Ordered Train Consist (LinkedList) ---");
        System.out.println("Creating ordered consist: Locomotive -> Passenger -> Cargo -> Guard");
        
        app.addBogieToEnd("Locomotive");
        app.addBogieToEnd("Sleeper");
        app.addBogieToEnd("AC-Chair");
        app.addBogieToEnd("Cargo");
        app.addBogieToEnd("Guard-Coach");
        
        // Display consist after initial additions
        app.displayOrderedConsist();
        
        // Insert Pantry Car at position 2 (after Sleeper)
        System.out.println("\n--- Inserting Pantry Car at Position 2 ---");
        app.insertBogieAtPosition(2, "Pantry-Car");
        
        // Display consist after insertion
        app.displayOrderedConsist();
        
        // Remove first bogie (Locomotive departure)
        System.out.println("\n--- Removing First Bogie (Locomotive) ---");
        app.removeFirstBogie();
        
        // Remove last bogie (Guard Coach departure)
        System.out.println("\n--- Removing Last Bogie (Guard Coach) ---");
        app.removeLastBogie();
        
        // Display final ordered consist
        System.out.println("\n--- Final Ordered Train Consist ---");
        app.displayOrderedConsist();
        
        // UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
        System.out.println("\n--- Building Ordered Formation (LinkedHashSet - Order + Uniqueness) ---");
        System.out.println("Attaching bogies to formation: Engine -> Sleeper -> Cargo -> Guard");
        
        app.attachBogieToFormation("Engine");
        app.attachBogieToFormation("Sleeper");
        app.attachBogieToFormation("Cargo");
        app.attachBogieToFormation("Guard");
        
        // Display formation after initial attachments
        app.displayOrderedFormation();
        
        // Attempt to attach duplicate bogies (automatic deduplication by LinkedHashSet)
        System.out.println("\n--- Attempting to Attach Duplicate Bogies ---");
        app.attachBogieToFormation("Sleeper");  // Duplicate
        app.attachBogieToFormation("Engine");   // Duplicate
        app.attachBogieToFormation("Pantry");   // New bogie
        
        // Display formation after duplicate attempts
        app.displayOrderedFormation();
        
        // Check if specific bogies exist in formation
        System.out.println("\n--- Checking Bogie Presence in Formation ---");
        if (app.isInFormation("Sleeper")) {
            System.out.println("✓ Sleeper is in the formation");
        } else {
            System.out.println("✗ Sleeper is not in the formation");
        }
        
        if (app.isInFormation("Locomotive")) {
            System.out.println("✓ Locomotive is in the formation");
        } else {
            System.out.println("✗ Locomotive is not in the formation");
        }
        
        // Final summary
        System.out.println("\n--- Final Summary ---");
        System.out.println("Total unique bogie IDs in train: " + app.getUniqueBogieIDCount());
        System.out.println("Total bogies in ordered consist: " + app.getConsistSize());
        System.out.println("Total bogies in ordered formation: " + app.getFormationSize());
    }
}
