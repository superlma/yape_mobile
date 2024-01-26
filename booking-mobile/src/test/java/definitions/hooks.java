package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class hooks {
    public static AndroidDriver driver;

    @Before
    public static void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulador")
                .setPlatformName("Android")
                .setPlatformVersion("14.0")
                .setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(240))
                .setApp("C:\\Users\\super\\OneDrive\\Documentos\\LUIS\\YAPE\\DESAFIO 2\\INSTALACIONES PREVIAS A APPIUM\\booking-com-32-9.apk");
        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), options
        );
    }

    @After
    public static void tearDown(){
        driver.quit();
    }
}
