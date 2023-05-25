package java.com.example.theater;

public class Bag {
    private Long cash;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long cash, Invitation invitation) {
        this.cash = cash;
        this.invitation = invitation;
    }

    public Bag(Long cash) {
        this.cash = cash;
    }

    private void plusCash(Long cash) {
        this.cash += cash;
    }

    private void minusCash(Long cash) {
        if (this.cash < cash) {
            // TODO: 2023/05/18 what is appropriate exception type?
        }
        this.cash -= cash;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    public Long hold(Ticket ticket){
        Long fee = 0L;
        if (!hasInvitation()) {
            minusCash(ticket.getFee());
            fee += ticket.getFee();
        }
        setTicket(ticket);
        return fee;

    }
}



