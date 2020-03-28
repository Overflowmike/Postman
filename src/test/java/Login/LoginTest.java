package Login;

public class LoginTests {private WebDriver driver;
}
</project>
public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://identity.getpostman.com/login?addAccount=1");
        Thread.wait(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("alabimichael23@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Lord@0573");

public static void main(String args[]) throws InterruptedException {
        Logintests = new Logintests();
        test.setUp();
        }

