package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testlogin1 {
	
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.get("https://www.lumens.com/");
	   //WebDriver wait=new WebDriverWait(driver,30);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Watches Collection']")));
				
	driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
	Thread.sleep(10000);
				
	Actions actions = new Actions(driver);
	WebElement Account = driver.findElement(By.className("btn-group dropdown-group"));
	actions.moveToElement(Account).build().perform();

	WebElement Signinbtn = driver.findElement(By.className("userlogin"));
	actions.moveToElement(Signinbtn);
	actions.click().build().perform();
	
}}
