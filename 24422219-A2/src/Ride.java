import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

import java.io.BufferedReader;
import java.io.FileReader;


public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;  // This variable will be used to know if the ride is open and who is operating it
    private Queue<Visitor> waitingLine; // Visitor Waiting List
    private LinkedList<Visitor> rideHistory; // This is used to keep the record on Ride History
    private LinkedList<Visitor> visitorsignup;
    private int maxRider;
    private int numOfCycles;


    // Default constructor
    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Constructor parameters
    public Ride(String rideName, int capacity, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = 0;
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Method to assign an Employee to operate the ride
    public void assignOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

    // Add Visitor to Queue using Offer method
    @Override
    public void AddVisitorToQueue(Visitor visitor) {
        waitingLine.offer(visitor);
        System.out.println(visitor.getName() + " added to the waiting line.");
    }

    //Remove Visitor from the Queue, also looking for the Visitors availability in the Queue
    @Override
    public void RemoveVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the waiting line.");
        } else {
            System.out.println(visitor.getName() + " not found in the waiting line.");
        }
    }

    // Print Queue
    @Override
    public void PrintQueue() {
        System.out.println("Current waiting line:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }


    // Add a Visitor to the ride history
    public void addVisitorToRideHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history.");
    }

    // Checking if a Visitor is in the ride history
    public boolean isVisitorInRideHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        if (found) {
            System.out.println(visitor.getName() + " is in the ride history.");
        } else {
            System.out.println(visitor.getName() + " is not in the ride history.");
        }
        return found;
    }

    // Getting the number of Visitors in the ride history
    public int getNumberOfVisitorsInRideHistory() {
        int size = rideHistory.size();
        System.out.println("Number of visitors in ride history: " + size);
        return size;
    }

    @Override
    public void PrintRideHistory() {
        System.out.println("Ride history:");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor.getName());
        }
    }

    // Sorting the ride history using a Comparator
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
        System.out.println("Ride history sorted.");
    }

    //@Override
    public void RunOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned. You can not run the ride.");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("No visitors in the waiting line. Can not run the ride.");
            return;
        }

        System.out.println("Running one cycle...");
        int visitorsToRide = Math.min(maxRider, waitingLine.size());
        for (int i = 0; i < visitorsToRide; i++) {
            Visitor visitor = waitingLine.poll();
            if (visitor != null) {
                rideHistory.add(visitor);
                System.out.println(visitor.getName() + " has taken the ride.");
            }
        }

        numOfCycles++;
        System.out.println("Run Cycle completed. Total cycles run: " + numOfCycles);
    }

    // Write ride history to a CSV file, file name will be passing later
    public void writeRideHistoryToCSV(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Ride Name: " + this.rideName + "\n");
            writer.write("Visitor Name,Age,Gender,Visitor ID,Ticket Type\n");
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + "," + visitor.getVisitorId() + "," + visitor.getTicketType() + "\n");
            }
            System.out.println("Ride history written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the ride history to the file: " + e.getMessage());
        }
    }

    // Reading the ride history from a CSV file and storing it into a LinkedList
    public void readRideHistoryFromCSV(String fileName) {
        visitorsignup = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // Skip the header line
            line = reader.readLine(); // Skip the second line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5) {

                    Visitor visitor = new Visitor(data[0], Integer.parseInt(data[1]), data[2], data[3], data[4]);
                    visitorsignup.add(visitor);
                }
            }
            System.out.println("The Ride history successfully captured from " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error from file: " + e.getMessage());
        }
    }

    // Printing all visitors signed up from the file
    public void printVisitorsSignup() {
        System.out.println("Number of visitors signed up: " + visitorsignup.size());
        for (Visitor visitor : visitorsignup) {
            System.out.println(visitor);
        }
    }









}