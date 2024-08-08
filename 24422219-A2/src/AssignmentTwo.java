public class AssignmentTwo {
    public static void main(String[] args) {

        Person person = new Person("Xavier Tissera", 25, "Male");

        // Employee instance
        Employee employee = new Employee("Jack Greg", 28, "Female", "E123", "Ride Operator");

        // Visitor instance
        Visitor visitor = new Visitor("Alice Johnson", 25, "Female", "V456", "VIP");

        // Ride instance
        Ride ride = new Ride("Boomerang Coaster", 20, employee);

        // Display output
        System.out.println("Person Name: " + person.getName());
        System.out.println("Employee Name: " + employee.getName() + ", Position: " + employee.getPosition());
        System.out.println("Visitor Name: " + visitor.getName() + ", Ticket Type: " + visitor.getTicketType());
        System.out.println("Ride Name: " + ride.getRideName() + ", Operator: " + ride.getOperator().getName());




    }
}
