import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.Assert;

public class Test {
	public static void main(String[] args) {
//		System.out.println("aaa");
//		System.setProperty("webdriver.chrome.driver", "/Users/msk/Downloads/chromedriver 2");
//		System.setProperty("webdriver.chrome.driver", "/Users/msk/Downloads/chromedriver-2");

//		System.out.println("11");
//        ChromeDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.linkedin.com/login");
//        
//        WebElement username=driver.findElement(By.id("username"));
//        WebElement password=driver.findElement(By.id("password"));
//        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
//        
//        username.sendKeys("example@gmail.com");
//        password.sendKeys("password");
//        login.click();
//        
//        String actualUrl="https://www.linkedin.com/feed/";
//        String expectedUrl= driver.getCurrentUrl();
        
//        Assert.assertEquals(expectedUrl,actualUrl);
		
		System.setProperty("webdriver.gecko.driver","/Users/msk/Downloads/chromedriver-2");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://app.7mind.de/login";
        String tagName = "";
        
        driver.get(baseUrl);
        WebElement username=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.name("submit"));
//        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        

		username.sendKeys("EMAIL");
		password.sendKeys("PASSWORD");
		login.click();
        
//        driver.close();
        System.exit(0);
	}
}  