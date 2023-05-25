package java.com.example.theater;

import java.util.List;

public class TicketOffice {
    private Long salesAmount;
    private List<Ticket> tickets;

    public TicketOffice(List<Ticket> tickets) {
        //salesAmount는 자동으로 초기화됨
        this.tickets = tickets;
    }

    // TODO: 2023/05/18 sellticket함수가 audience를 매개변수로 받는게 좋은가? audience에 대한 의존성 증가
    public void sellTicket(Audience audience){
        Ticket ticket = getTicket();
        plusAmount(audience.buy(ticket));
    }

    private Ticket getTicket(){
        if (tickets.size() == 0) {
            // TODO: 2023/05/18 what is appropriate exception type?
//            throw new Exception("ticket sold out");
        }
        Ticket ticket = tickets.remove(0);
        plusAmount(ticket.getFee());
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.salesAmount += amount;
    }

    private void minusAmount(Long amount) {
        this.salesAmount -= amount;
    }
}

