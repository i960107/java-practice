package java.com.example.theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        // TODO: 2023/05/18 is it okay that audience get Ticket as parameter?
        ticketOffice.sellTicket(audience);
    }
}
