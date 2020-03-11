package mts_rest.date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CalendarController {
    private final AtomicLong timeCounter = new AtomicLong();
    @GetMapping("/time")
    public CalendarTime time() {
        return new CalendarTime(timeCounter.incrementAndGet());
    }

    private final AtomicLong dateCounter = new AtomicLong();
    @GetMapping("/date")
    public CalendarDate date(){
        return new CalendarDate(dateCounter.incrementAndGet());
    }
}
