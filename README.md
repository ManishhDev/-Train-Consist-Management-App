# Train Consist Management App

## Project Overview
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train's consist, which is a collection of bogies attached to an engine.

## Features Supported
- Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking
- Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints
- Tracking composition, capacity, cargo types, and safety compliance

## Use Cases

### UC1: Initialize Train and Display Consist Summary
**Goal:** Initialize the Train Consist Management App and display the initial state of the train.

**Actor:** User

**Flow:**
1. User runs the program
2. Application prints welcome message
3. Train consist is initialized
4. Initial bogie count is displayed
5. Program continues

**Key Concepts:**
- Class – Container to hold program data and logic
- Main Method – Entry point: `public static void main(String[] args)`
- Static Keyword – Allows JVM to invoke main() without object instantiation
- ArrayList – Resizable list for storing bogies dynamically
- List Interface – Abstraction over different List implementations
- Console Output – Using System.out.println()
- Dynamic Initialization – Creating empty collection for future population

**Status:** ✅ Implemented

---

### UC2: Add Passenger Bogies to Train (ArrayList Operations)

**Goal:** Allow dynamic insertion and removal of passenger bogies using ArrayList operation.

**Actor:** User

**Flow:**
1. User runs the program
2. Passenger bogies (Sleeper, AC Chair, First Class) are added
3. Bogies list is displayed after insertion
4. A bogie (AC Chair) is removed
5. Bogie existence is checked using contains()
6. Final list state is displayed
7. Program continues

**Key Concepts:**
- ArrayList Methods – add(), remove(), contains(), size()
- add() Method – Inserts elements into the list at the end
- remove() Method – Deletes a specific element from the list
- contains() Method – Checks whether a given element exists in the list
- Insertion Order Preservation – ArrayList maintains the order of addition
- CRUD Operations – Create, Read, Update, Delete operations on collections
- List Iteration – Displaying elements using for loop and get()

**Key Requirements:**
✓ Create an ArrayList<String> for passenger bogies  
✓ Add bogies: Sleeper, AC Chair, First Class using add()  
✓ Print the list after insertion showing all bogies  
✓ Remove one bogie (AC Chair) using remove()  
✓ Use contains() to check if Sleeper exists  
✓ Print final list state after removal  

**Status:** ✅ Implemented

---

### UC3: Track Unique Bogie IDs (Set – HashSet)

**Goal:** Ensure no duplicate bogie IDs are added to the train using HashSet.

**Actor:** User

**Flow:**
1. User adds bogie IDs (BG101, BG102, BG103)
2. System inserts into HashSet
3. User attempts to add duplicate IDs
4. System automatically deduplicates and ignores duplicates
5. Unique IDs are displayed

**Key Concepts:**
- Set Interface – Collection type that does not allow duplicate elements
- HashSet – Implementation of Set that stores elements using hashing for fast access
- add() Method – Inserts values into the set, returns true if added, false if duplicate
- Automatic Deduplication – HashSet ensures uniqueness without manual checks
- Unordered Storage – Elements are not stored using index positions
- Iterator/Enhanced For Loop – Iterating through HashSet elements

**Key Requirements:**
✓ Create a HashSet<String> for bogie IDs  
✓ Add unique bogie IDs: BG101, BG102, BG103  
✓ Print the set after insertion showing all unique IDs  
✓ Attempt to add duplicate IDs: BG101, BG102  
✓ Observe that duplicates are automatically rejected  
✓ Add a new unique ID: BG104  
✓ Print final set showing all unique IDs (4 total)  

**Key Benefits:**
- Enforces business constraints (no duplicate IDs)
- Prevents data corruption in railway system
- Teaches when to use Set instead of List
- Demonstrates automatic uniqueness enforcement
- Real-world requirement in train management

**Status:** ✅ Implemented

---

## Project Structure
```
Train Consist Management App/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── TrainConsistApp.java
│   └── test/
├── README.md
└── .gitignore
```

## How to Compile and Run

### Compile
```bash
cd src\main\java
javac TrainConsistApp.java
```

### Run
```bash
java TrainConsistApp
```

## Expected Output
```
=== Train Consist Management App ===
Initial bogie count: 0
Train consist initialized successfully.

--- Adding Passenger Bogies ---
✓ Added: Sleeper
✓ Added: AC Chair
✓ Added: First Class

--- Current Train Consist ---
Total bogies: 3
1. Sleeper
2. AC Chair
3. First Class

--- Removing a Bogie ---
✓ Removed: AC Chair

--- Current Train Consist ---
Total bogies: 2
1. Sleeper
2. First Class

--- Checking Bogie Existence ---
✓ "Sleeper" exists in train consist.
✗ "AC Chair" does not exist in train consist.

--- Adding Unique Bogie IDs (HashSet) ---
✓ Added Bogie ID: BG101
✓ Added Bogie ID: BG102
✓ Added Bogie ID: BG103

--- Unique Bogie IDs (HashSet) ---
Total unique bogie IDs: 3
1. BG103
2. BG102
3. BG101

--- Attempting to Add Duplicate Bogie IDs ---
⚠ Duplicate Bogie ID ignored: BG101
⚠ Duplicate Bogie ID ignored: BG102
✓ Added Bogie ID: BG104

--- Unique Bogie IDs (HashSet) ---
Total unique bogie IDs: 4
1. BG104
2. BG103
3. BG102
4. BG101

--- Final Summary ---
Total unique bogie IDs in train: 4
```

## Development Workflow
Each use case follows a Git branching strategy:
1. Create a new branch: `git checkout -b UC#-DescriptionName`
2. Implement the use case
3. Update README.md with use case details
4. Commit changes: `git commit -m "Your_Name Added UseCase_Name"`
5. Push to branch: `git push origin UC#-DescriptionName`
6. Create Pull Request on GitHub
7. Merge to main
8. Checkout main and pull latest changes

---

**Last Updated:** April 2, 2026
