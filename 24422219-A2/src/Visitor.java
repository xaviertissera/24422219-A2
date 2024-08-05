public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    // Default constructor
    public Visitor() {
    }

    // Constructor with parameters
    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        super(name, age, gender);
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
}
