import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Ticket System class to simulate a full ticketing system
public class TicketSystem {
    private Queue<Ticket> ticketQueue;
    private Random random;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
        random = new Random();
    }

    // Generate tickets and add to the queue
    public void generateTickets(int numberOfTickets) {
        for (int i = 1; i <= numberOfTickets; i++) {
            Ticket newTicket = new Ticket(i);
            ticketQueue.add(newTicket);
            System.out.println("Generated ");
            newTicket.displayTicket();
            // Simulate random ticket generation interval (1-3 seconds)
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(3) + 1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Process tickets from the queue
    public void processTickets() {
        System.out.println("\nStarting to serve tickets...\n");

        while (!ticketQueue.isEmpty()) {
            Ticket ticket = ticketQueue.poll();  // Dequeue the ticket
            System.out.println("Now serving Ticket #" + ticket.getTicketNumber() + " - Issued at: " + ticket.getTimestamp());
            // Simulate random serving time (2-5 seconds)
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(4) + 2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nAll tickets have been served.");
    }
}