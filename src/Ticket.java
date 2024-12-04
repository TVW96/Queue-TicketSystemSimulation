import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Ticket class to hold ticket details
class Ticket {
    private int ticketNumber;
    private LocalDateTime timestamp;

    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.timestamp = LocalDateTime.now();
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }

    public void displayTicket() {
        System.out.println("Ticket #" + ticketNumber + " - Issued at: " + getTimestamp());
    }
}