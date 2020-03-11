package theme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ThemeController {
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/theme")
    public ThemeColor time() {
        return new ThemeColor(counter.incrementAndGet());
    }


}
