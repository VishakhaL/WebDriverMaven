import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
public static WebDriver driver;
@BeforeSuite
	public void setUp(){
	
	System.setProperty("webdriver.chrome.driver",".\\Browser\\chromedriver.exe");
	driver=new ChromeDriver();
	}

	@Test
	public void doLogin(){
		driver.get("http://way2automation.com/");
		driver.findElement(By.xpath("//a[text()='MEMBER LOGIN']")).click();
	}
	
	 @AfterSuite
	  public void closeBrowser(){
			driver.close();
		}
}
