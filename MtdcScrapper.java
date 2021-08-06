package asssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class MtdcScrapper implements MtdcConstants{

	public  WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void checkinData() throws InterruptedException {
	
		//this.driver.get("http://mtdc.letschbang.com/stays/mtdc-nagpur");
		this.driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement findRooms = driver.findElement(MtdcConstants.FIND_A_ROOM);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findRooms);
		this.driver.findElement(By.xpath("//*[@id=\'find-a-room\']/div[1]/span")).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.CLICK_ON_DATE1).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.CLICK_ON_DATE2).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.GUESTS_BUTTON).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.ADULTS_ADDER).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.BLANK_SPACE).click();
		Thread.sleep(2000);
		this.driver.findElement(MtdcConstants.CHECK_AVAILABILITY_BUTTON).click();
	}
	
	@Test
	public void hotelBooking() throws InterruptedException {
		Thread.sleep(2000);
		WebElement rooms = driver.findElement(MtdcConstants.CLICK_ON_BLANK_SPACE);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms);
	    Thread.sleep(2000);
	    WebElement rooms1 = driver.findElement(MtdcConstants.CLICK_ON_BLANK_SPACE);
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms1);
	   Thread.sleep(2000);
	   this.driver.findElement(MtdcConstants.SELECT_ROOM_BUTTON).click();
	   WebElement rooms2 = driver.findElement(MtdcConstants.ROOM_ADDER);
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms2);
	   Thread.sleep(2000);
	   driver.findElement(MtdcConstants.CHECK_OUT_BUTTON).click();
	   Thread.sleep(7000);
	   WebElement rooms3 = driver.findElement(MtdcConstants.BLANK_SPACE_2);
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms3);
	   Thread.sleep(5000);
	   driver.findElement(MtdcConstants.CONFIRM_AND_PAY_BUTTON).click();
	   //Thread.sleep(2000);
	}
	
	//@Test
//	public void buttonCheck() throws InterruptedException {
		
	//}
	/*
		MtdcScrapper scrapper = new MtdcScrapper(driver);
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		driver.get("http://mtdc.letschbang.com/stays/mtdc-nagpur");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		scrapper.checkinData();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'input-group-4\']/div/div/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'input-group-4\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'about\']/div/div/div[2]/div/div/div/form/button")).click();
		Thread.sleep(2000);
		WebElement rooms = driver.findElement(By.xpath("//*[@id=\'chardonnay\']"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms);
	    Thread.sleep(2000);
	    WebElement rooms1 = driver.findElement(By.xpath("//*[@id=\'chardonnay\']"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms1);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\'addonBtn66481\']")).click();
	   WebElement rooms2 = driver.findElement(By.xpath("//*[@id=\'addCount66481\']/div/div[2]/button"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms2);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\'nav-collapse\']/ul/button")).click();
	   Thread.sleep(7000);
	   WebElement rooms3 = driver.findElement(By.xpath("//div[@id='accordion-3']/div/p/div/p"));
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rooms3);
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@id='modal-center___BV_modal_body_']/div/div/div[2]/div/button[2]")).click();
		
		/*driver.findElement(By.xpath("//*[@id=\'input-group-4\']/div/div/div[1]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'input-group-4\']/div/div/div[1]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'input-group-4\']/div/div/div[1]/div[2]/div/button[2]")).click();
		*/

}


