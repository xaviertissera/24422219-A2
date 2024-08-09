public class AssignmentTwo {
    public static void main(String[] args) {
        // Main method content
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
    }

    public void partThree() {
        // Part 3
        // New Ride object with Variables
        // Updated for part 5 including new variables
        Ride boomerangCoaster = new Ride("Boomerang Coaster", 2, new Employee("Jane Smith", 28, "Female", "E123", "Ride Operator"), 2);

        // Create five Visitor objects
        // To make the code more efficient i have used an array of visitors and using a for loop im adding them to the queue
        Visitor[] visitors = {
                new Visitor("Jack", 30, "Male", "V001", "Regular"),
                new Visitor("Shaggy", 25, "Male", "V002", "Regular"),
                new Visitor("Xavier", 28, "Male", "V003", "Regular"),
                new Visitor("Natilie", 22, "Female", "V004", "Regular"),
                new Visitor("John", 35, "Male", "V005", "Regular")
        };
        for (Visitor visitor : visitors) {
            boomerangCoaster.AddVisitorToQueue(visitor);
        }

        System.out.println();

        // Remove a Visitor from the Queue
        boomerangCoaster.RemoveVisitorFromQueue(visitors[2]);
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
        Visitor[] visitors = {
                new Visitor("Lee", 40, "Male", "V006", "Regular"),
                new Visitor("Mary", 29, "Female", "V007", "Regular"),
                new Visitor("Ashley", 25, "Female", "V008", "Regular"),
                new Visitor("Scar", 27, "Male", "V009", "Regular"),
                new Visitor("Tom", 32, "Male", "V010", "Regular")
        };
        for (Visitor visitor : visitors) {
            supermanEscape.addVisitorToRideHistory(visitor);
        }
        System.out.println();

        // Checking for a Visitor is in the Ride history
        supermanEscape.isVisitorInRideHistory(visitors[2]);
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
        Visitor[] visitors = {
                new Visitor("Zara", 22, "Female", "V011", "Regular"),
                new Visitor("Bob", 34, "Male", "V012", "Regular"),
                new Visitor("Eve", 29, "Female", "V013", "Regular"),
                new Visitor("Mike", 31, "Male", "V014", "Regular"),
                new Visitor("Steve", 27, "Male", "V015", "Regular")
        };
        for (Visitor visitor : visitors) {
            kansasTwister.addVisitorToRideHistory(visitor);
        }
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
        Visitor[] visitors = {
                new Visitor("James", 21, "Male", "V016", "Regular"),
                new Visitor("Anne", 22, "Female", "V017", "Regular"),
                new Visitor("Sukman", 23, "Male", "V018", "Regular"),
                new Visitor("Frank", 24, "Male", "V019", "Regular"),
                new Visitor("Alice", 25, "Female", "V020", "Regular"),
                new Visitor("Andria", 26, "Female", "V021", "Regular"),
                new Visitor("Ernest", 27, "Male", "V022", "Regular"),
                new Visitor("Joyce", 28, "Female", "V023", "Regular"),
                new Visitor("Richard", 29, "Male", "V024", "Regular"),
                new Visitor("Lan", 30, "Female", "V025", "Regular")
        };
        for (Visitor visitor : visitors) {
            hyperCoaster.AddVisitorToQueue(visitor);
        }
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

    public void partSix() {

        // Part 6
        Ride tijuanaTaxis = new Ride("Tijuana Taxis", 6, new Employee("Carlos Martinez", 35, "Male", "E127", "Ride Operator"), 3);

        Visitor[] visitors = {
                new Visitor("Leena", 28, "Female", "V026", "Regular"),
                new Visitor("Alyson", 24, "Female", "V027", "VIP"),
                new Visitor("Rose", 22, "Female", "V028", "Regular"),
                new Visitor("Marco", 30, "Male", "V029", "VIP"),
                new Visitor("Martin", 26, "Male", "V030", "Regular"),
                new Visitor("Jeff", 31, "Male", "V031", "Regular")
        };
        for (Visitor visitor : visitors) {
            tijuanaTaxis.AddVisitorToQueue(visitor);
        }

        System.out.println();
        tijuanaTaxis.RunOneCycle();

        System.out.println();
        tijuanaTaxis.PrintQueue();

        System.out.println();
        tijuanaTaxis.PrintRideHistory();

        // Write the visitors who took the ride in to a csv, passing the file name
        System.out.println();
        tijuanaTaxis.writeRideHistoryToCSV("rideHistoryRecord.csv");

        System.out.println();
        System.out.println("Part 7---------------------------------");
    }


}
