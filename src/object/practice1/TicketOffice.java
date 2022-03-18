package object.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private List<Ticket> tickets = new ArrayList<>();
    private Long amount;

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        // Ticket과 amount를 이제 TicketOffice가 스스로 관리한다.
        // 하지만 audience와의 의존성이 추가가 되었다.
        // 변경 전에는 audience가 산출한 값을 인자로 받았기 때문에
        // audience를 몰라도 되었다.
        plusAmount(audience.Buy(getTicket()));
    }


    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

}
