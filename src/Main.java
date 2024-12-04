public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        // Phase 1: Generate Tickets
        int totalTickets = 5; // You can modify the number of tickets
        ticketSystem.generateTickets(totalTickets);

        // Phase 2: Process Tickets
        ticketSystem.processTickets();
    }
}