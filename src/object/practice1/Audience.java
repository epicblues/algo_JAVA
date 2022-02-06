package object.practice1;

public class Audience {
    private Bag bag;
    // getBag 제거
    // 캡슐화

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // Audience 스스로 가방의 초대장을 확인한다.
    // 외부에서 더 이상 Audience가 Bag을 소유하고 있다는 사실을 알 필요가 없다.
    public Long Buy(Ticket ticket) {
        // bag의 내용물은 bag이 스스로 처리하도록 캡슐화
        return bag.hold(ticket);
    }
}
