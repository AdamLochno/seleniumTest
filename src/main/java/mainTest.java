import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class mainTest {

    @FindBy(css = "input[id='login_id']")
    private WebElement loginField;
    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;
    @FindBy(css = "input[type='password']")
    private WebElement passwordField;
    @FindBy(css = "button[id='login_next']")
    private WebElement loginButton;


    WebDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://demobank.jaktestowac.pl/logowanie_etap_1.html");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }

    @Test
    public void firstTest() {
        System.out.println("Początek pierwszego testu");
        System.out.println("Początek pierwszego testu");
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        loginField.sendKeys("12345678");
    submitButton.click();
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    passwordField.sendKeys("12345");
    loginButton.click();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        System.out.println("Koniec pierwszego testu");
    }

    @Test
    public void secondTest() {
        System.out.println("Początek drugiego testu");
        System.out.println("Koniec drugiego testu");
    }

    @After
    public void quit() {
        driver.quit();
    }
}


