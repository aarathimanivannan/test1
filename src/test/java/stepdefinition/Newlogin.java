package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Newlogin {

WebDriver Driver; 
	

	public static WebDriver driver;
	
	@Given("Open the Chrome browser and launch the Lumens Website")
	
		public void open_the_chrome_browser_and_launch_the_lumens_website() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			driver.get("https://www.lumens.com/");
			WebDriverWait wait = new WebDriverWait(driver,60);

			 
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ltkpopup-close-button']")));
	        driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']")).click();
			Thread.sleep(10000);
						
			Actions actions = new Actions(driver);
			WebElement Account = driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div"));
			actions.moveToElement(Account).build().perform();

			WebElement Signinbtn = driver.findElement(By.className("userlogin"));
			actions.moveToElement(Signinbtn);
			actions.click().build().perform();
			Thread.sleep(3000);
			
		     File src=new File("C:\\Users\\91994\\Documents\\credentials.xlsx");
				FileInputStream input=new FileInputStream(src);
				XSSFWorkbook wb=new XSSFWorkbook(input);
				XSSFSheet sheet=wb.getSheet("Sheet1");
				String uname=	sheet.getRow(1).getCell(0).getStringCellValue();
				
			driver.findElement(By.xpath("//*[@id=\"dwfrm_login_username\"]")).sendKeys("aarathi91@gmail.com");
		     driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys("Welcome@123");
		     Thread.sleep(3000);
		     
		     driver.findElement(By.xpath("//button[@class=\"global pop-up\"]")).click();
		     Thread.sleep(10000);
		     
		 	
			WebElement Lighting = driver.findElement(By.xpath("//span[@title=\"lighting\"]"));
			actions.moveToElement(Lighting).build().perform();

			WebElement Ceilinglightsbtn = driver.findElement(By.xpath("//a[@title=\"Ceiling Lights\"]"));
			actions.moveToElement(Ceilinglightsbtn);
			actions.click().build().perform();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a/span")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a/span")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"refinement-LU_BestSellerScore\"]/div/ul/li[1]/a/span[1]/input")).click();
			Thread.sleep(10000);
		     
			driver.findElement(By.xpath("//*[@id=\"refinement-Style\"]/div/ul/li[1]/a/span[1]/input")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@class=\"name-link\"]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"atcModal\"]/div/div/div/div/div/div[2]/div[2]/a[1]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//span[@class=\"qty-increment-decrement qty-increment\"]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//span[@class=\"qty-increment-decrement qty-increment\"]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//span[@class=\"qty-increment-decrement qty-decrement\"]")).click();
			Thread.sleep(20000);
			
			WebElement livechat = driver.findElement(By.xpath("//*[@id=\"LPMlabel-1617952206989-5\"]"));
			actions.moveToElement(livechat);
			actions.click().build().perform();
			Thread.sleep(12000);
			
			/*
			 * driver.findElement(By.xpath("//*[@id=\"LPMlabel-1617948629867-2\"]")).click()
			 * ; Thread.sleep(5000);
			 */
			
			driver.findElement(By.xpath("//*[@id=\"txt_4616424\"]")).sendKeys("Aarathi");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"txt_4616425\"]")).sendKeys("aarathi91@gmail.com");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@class=\"lp_submit_button lpc_survey-area__submit-button lpc_desktop\"]")).click();
			Thread.sleep(15000);
			
			driver.findElement(By.xpath("//*[@id=\"LP_ChatViewController_1\"]/div[2]/div[1]/textarea")).sendKeys("Hi, Good evening");
			Thread.sleep(5000);
			
			
	}}
	
	//@Then("Enter Username and password")
	//public void enter_username_and_password() throws Exception {
		
	//}

	//@Then("click on Login")
	//public void click_on_login() throws Exception {
		
	

