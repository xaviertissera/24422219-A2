public class AssignmentTwo {
    public static void main(String[] args) {
        // Main method content
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
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

    public void partFourA() {
        // Part 4A
        // New Ride object
        Ride supermanEscape = new Ride("Superman Escape", 4, new Employee("John Doe", 35, "Male", "E124", "Ride Operator"));

        // Visitor objects
        Visitor visitor1 = new Visitor("Lee", 40, "Male", "V006", "Regular");
        Visitor visitor2 = new Visitor("Mary", 29, "Female", "V007", "Regular");
        Visitor visitor3 = new Visitor("Ashley", 25, "Female", "V008", "Regular");
        Visitor visitor4 = new Visitor("Scar", 27, "Male", "V009", "Regular");
        Visitor visitor5 = new Visitor("Tom", 32, "Male", "V010", "Regular");

        // Add Visitors to the Ride history
        supermanEscape.addVisitorToRideHistory(visitor1);
        supermanEscape.addVisitorToRideHistory(visitor2);
        supermanEscape.addVisitorToRideHistory(visitor3);
        supermanEscape.addVisitorToRideHistory(visitor4);
        supermanEscape.addVisitorToRideHistory(visitor5);

        // Checking for a Visitor is in the Ride history
        supermanEscape.isVisitorInRideHistory(visitor3);

        // Number of Visitors in the history
        supermanEscape.getNumberOfVisitorsInRideHistory();

        // Print all the Visitors in the Ride history
        supermanEscape.PrintRideHistory();

    }

    public void partFourB() {
        // Part 4B
        // New Ride object
        Ride kansasTwister = new Ride("Kansas Twister", 3, new Employee("Alice Smith", 30, "Female", "E125", "Ride Operator"));

        // New Visitor objects
        Visitor visitor1 = new Visitor("Zara", 22, "Female", "V011", "Regular");
        Visitor visitor2 = new Visitor("Bob", 34, "Male", "V012", "Regular");
        Visitor visitor3 = new Visitor("Eve", 29, "Female", "V013", "Regular");
        Visitor visitor4 = new Visitor("Mike", 31, "Male", "V014", "Regular");
        Visitor visitor5 = new Visitor("Steve", 27, "Male", "V015", "Regular");

        // Adding Visitors to the Ride history
        kansasTwister.addVisitorToRideHistory(visitor1);
        kansasTwister.addVisitorToRideHistory(visitor2);
        kansasTwister.addVisitorToRideHistory(visitor3);
        kansasTwister.addVisitorToRideHistory(visitor4);
        kansasTwister.addVisitorToRideHistory(visitor5);

        // Printing all Visitors in the Ride history
        System.out.println("Before sorting:");
        kansasTwister.PrintRideHistory();

        // Sorting the Ride history
        kansasTwister.sortRideHistory(new VisitorComparator());

        // Printing all Visitors in the Ride history again after Sorting is done
        System.out.println("After sorting:");
        kansasTwister.PrintRideHistory();
    }


}
