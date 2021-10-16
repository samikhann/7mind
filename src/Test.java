import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/msk/Downloads/chromedriver-2");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://app.7mind.de/login";
        String tagName = "";
        
        driver.get(baseUrl);
        WebElement username=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.name("submit"));

        

		username.sendKeys("EMAIL");
		password.sendKeys("PASSWORD ");
		login.click();
        

        System.exit(0);
	}
}  