package object.practice6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class RecurringSchedule {
    private String subject;
    private DayOfWeek dayOfWeek;
    private LocalTime from;
    private Duration duration;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalTime getFrom() {
        return from;
    }
}
