package object.practice;

public class TicketSeller {
    private TicketOffice ticketOffice;
    // getTicketOffice 제거됨. 결합력 낮추기
    // 즉 ticketOffice에 대한 접근은 오직 ticketSeller 안에만 존재하게 된다.
    // 캡슐화

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // theater에서 ticketoffice로 직접 접근하는 것을 막기 위해
    // 처리 로직을 ticketseller 로 옮겼다.
    public void sellTo(Audience audience) {
        // ticketSeller audience의 bag에 의존하지 않는다.

        // ticketOffice의 내부 구현에 의존하지 않는다.
        ticketOffice.sellTicketTo(audience);
    }

}
