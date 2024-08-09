public class Visitor extends Person {
    private String name;
    private int age;
    private String gender;
    private String visitorId;
    private String ticketType;

    // Default constructor
    public Visitor() {
        super("", 0, "");
        this.visitorId = "";
        this.ticketType = "Regular";
    }

    // Constructor with parameters
    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        super(name, age, gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getters and Setters
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Visitor Name: " + name + ", Age: " + age + ", Gender: " + gender +
                ", Visitor ID: " + visitorId + ", Ticket Type: " + ticketType;
    }
}
