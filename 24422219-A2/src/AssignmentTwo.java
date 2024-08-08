public class AssignmentTwo {
    public static void main(String[] args) {
        // Main method content
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }

    public void partThree() {
        // Part 3
        // New Ride object with Variables
        Ride boomerangCoaster = new Ride("Boomerang Coaster", 2, new Employee("Jane Smith", 28, "Female", "E123", "Ride Operator"));

        // Create five Visitor objects
        Visitor visitor1 = new Visitor("Jack", 30, "Male", "V001", "Regular");
        Visitor visitor2 = new Visitor("Shaggy", 25, "Male", "V002", "Regular");
        Visitor visitor3 = new Visitor("Xavier", 28, "Male", "V003", "Regular");
        Visitor visitor4 = new Visitor("Natilie", 22, "Female", "V004", "Regular");
        Visitor visitor5 = new Visitor("John", 35, "Male", "V005", "Regular");

        // Add Visitors to the Queue - waiting list
        boomerangCoaster.AddVisitorToQueue(visitor1);
        boomerangCoaster.AddVisitorToQueue(visitor2);
        boomerangCoaster.AddVisitorToQueue(visitor3);
        boomerangCoaster.AddVisitorToQueue(visitor4);
        boomerangCoaster.AddVisitorToQueue(visitor5);

        // Remove a Visitor from the Queue
        boomerangCoaster.RemoveVisitorFromQueue(visitor3);

        // Print all Visitors currently available in the Queue
        boomerangCoaster.PrintQueue();


    }


}
