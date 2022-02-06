package object.practice1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }
    // Theater의 유일한 책임
    // 관람객을 입장시키는 것
    public void enter(Audience audience) {
        // 더 이상 ticketOffice 에 직접 접근하지 않는다.
        // Theater 는 오직 TicketSeller 의 인터페이스에만 의존한다.

        ticketSeller.sellTo(audience);
    }

}
