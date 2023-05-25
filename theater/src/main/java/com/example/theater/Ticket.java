package java.com.example.theater;

public class Ticket {
    private Long fee;

    public Long getFee() {
        return fee;
    }

    public Ticket(Long fee){
        if(this.fee != fee){
            throw new IllegalArgumentException();
        }
    }
}
