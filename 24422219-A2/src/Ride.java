import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;  // This variable will be used to know if the ride is open and who is operating it
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    // Default constructor
    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Constructor parameters
    public Ride(String rideName, int capacity, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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




}