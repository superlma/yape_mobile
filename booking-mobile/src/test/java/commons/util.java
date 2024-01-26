package commons;

import definitions.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class util extends hooks {
    public static WebDriverWait wait;

    public util() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(240));
    }
}
