package object.practice6;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject;
    private LocalDateTime from;
    private Duration duration;

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    // Query
    public boolean isSatisfied(RecurringSchedule schedule) {
        if(from.getDayOfWeek() != schedule.getDayOfWeek() ||
                !from.toLocalTime().equals((schedule.getFrom())) ||
                !duration.equals(schedule.getDuration())) {
            // 문제 발생 영역 (명령 역할까지 한다.)
            reschedule(schedule);
            return false;
        }

        return true;
    }

    private void reschedule(RecurringSchedule schedule) {
        // 원본 데이터를 변경한다.(command)
        from = LocalDateTime.of(from.toLocalDate().plusDays(daysDistance(schedule)), schedule.getFrom());
        duration = schedule.getDuration();
    }

    private long daysDistance(RecurringSchedule schedule) {
        return schedule.getDayOfWeek().getValue() - from.getDayOfWeek().getValue();
    }
}
