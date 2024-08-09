public class AssignmentTwo {
    public static void main(String[] args) {
        // Main method content
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
    }

    public void partThree() {
        // Part 3
        // New Ride object with Variables
        // Updated for part 5 including new variables
        Ride boomerangCoaster = new Ride("Boomerang Coaster", 2, new Employee("Jane Smith", 28, "Female", "E123", "Ride Operator"), 2);

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
        System.out.println();

        // Remove a Visitor from the Queue
        boomerangCoaster.RemoveVisitorFromQueue(visitor3);
        System.out.println();

        // Print all Visitors currently available in the Queue
        boomerangCoaster.PrintQueue();
        System.out.println();

        System.out.println("PART 4A---------------------------------");


    }

    public void partFourA() {
        // Part 4A
        // New Ride object
        Ride supermanEscape = new Ride("Superman Escape", 4, new Employee("John Doe", 35, "Male", "E124", "Ride Operator"), 4);

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
        System.out.println();

        // Checking for a Visitor is in the Ride history
        supermanEscape.isVisitorInRideHistory(visitor3);
        System.out.println();

        // Number of Visitors in the history
        supermanEscape.getNumberOfVisitorsInRideHistory();
        System.out.println();

        // Print all the Visitors in the Ride history
        supermanEscape.PrintRideHistory();
        System.out.println();

        System.out.println("PART 4B---------------------------------");

    }

    public void partFourB() {
        // Part 4B
        // New Ride object
        Ride kansasTwister = new Ride("Kansas Twister", 3, new Employee("Alice Smith", 30, "Female", "E125", "Ride Operator"), 3);

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
        System.out.println();

        // Printing all Visitors in the Ride history
        System.out.println("Before sorting:");
        kansasTwister.PrintRideHistory();
        System.out.println();

        // Sorting the Ride history
        kansasTwister.sortRideHistory(new VisitorComparator());
        System.out.println();

        // Printing all Visitors in the Ride history again after Sorting is done
        System.out.println("After sorting:");
        kansasTwister.PrintRideHistory();
        System.out.println();

        System.out.println("PART 5---------------------------------");
    }

    public void partFive() {
        // Part 5
        // New Ride object
        Ride hyperCoaster = new Ride("HyperCoaster", 10, new Employee("Emily Johnson", 27, "Female", "E126", "Ride Operator"), 5);

        // Visitor objects
        Visitor visitor1 = new Visitor("James", 21, "Male", "V016", "Regular");
        Visitor visitor2 = new Visitor("Anne", 22, "Female", "V017", "Regular");
        Visitor visitor3 = new Visitor("Sukman", 23, "Male", "V018", "Regular");
        Visitor visitor4 = new Visitor("Frank", 24, "Male", "V019", "Regular");
        Visitor visitor5 = new Visitor("Alice", 25, "Female", "V020", "Regular");
        Visitor visitor6 = new Visitor("Andria", 26, "Female", "V021", "Regular");
        Visitor visitor7 = new Visitor("Ernest", 27, "Male", "V022", "Regular");
        Visitor visitor8 = new Visitor("Joyce", 28, "Female", "V023", "Regular");
        Visitor visitor9 = new Visitor("Richard", 29, "Male", "V024", "Regular");
        Visitor visitor10 = new Visitor("Lan", 30, "Female", "V025", "Regular");

        // Adding Visitors to the Queue
        hyperCoaster.AddVisitorToQueue(visitor1);
        hyperCoaster.AddVisitorToQueue(visitor2);
        hyperCoaster.AddVisitorToQueue(visitor3);
        hyperCoaster.AddVisitorToQueue(visitor4);
        hyperCoaster.AddVisitorToQueue(visitor5);
        hyperCoaster.AddVisitorToQueue(visitor6);
        hyperCoaster.AddVisitorToQueue(visitor7);
        hyperCoaster.AddVisitorToQueue(visitor8);
        hyperCoaster.AddVisitorToQueue(visitor9);
        hyperCoaster.AddVisitorToQueue(visitor10);
        System.out.println();

        // Print all Visitors in the Queue
        System.out.println("Visitors in the waiting line:");
        hyperCoaster.PrintQueue();
        System.out.println();

        // Run one cycle
        hyperCoaster.RunOneCycle();
        System.out.println();

        // Print all Visitors in the Queue after one cycle
        System.out.println("Visitors in the waiting line after one cycle:");
        hyperCoaster.PrintQueue();
        System.out.println();

        // Print all Visitors in the Ride history
        System.out.println("Visitors in the ride history:");
        hyperCoaster.PrintRideHistory();
        System.out.println();

        System.out.println("Part 6---------------------------------");
    }


}
