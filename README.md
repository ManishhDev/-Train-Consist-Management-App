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
