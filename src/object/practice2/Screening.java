package object.practice2;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie =movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;

    }

    // Screening이 갖는 책임
    // 영화를 예매하라!
    public Reservation reserve(Customer customer, int audienceCount) {

        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public Money calculateFee(int audienceCount) {
        // Screening이 movie의 calculateMovieFee '메시지를 전송한다'
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public boolean isSequence(int sequence){
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
