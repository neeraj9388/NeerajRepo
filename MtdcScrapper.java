	package asssignment;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.openqa.selenium.JavascriptExecutor;
	
	// In this Class all testing operations are performed. 
	public class MtdcScrapper implements MtdcConstants{
		
		// Declaring Web-driver as driver.
		public  WebDriver driver;
		
		/**
		 * This method is where base url and Chrome Driver is set.
		 */
		@BeforeTest
		public void setBaseUrl() {
			System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			driver.get(baseUrl);
		}
		
		/**
		 * In this method we do check-in operations.
		 * @throws InterruptedException
		 * InterruptedException is used for sleep.
		 * Wait - 1000 mili-second i.e it will wait for 1sec.
		 */
		@Test
		public void checkinData() throws InterruptedException {
		
			// Here Window will get maximize.
			this.driver.manage().window().maximize();
			//here web-driver will wait to load page.
			Thread.sleep(2000);
			//Here Scroll Operation is performed.
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
		
		/**
		 * in this method we perform Hotel booking operations such as room addition and payment gateway.
		 * @throws InterruptedException
		 * InterruptedException is used for sleep.
		 */
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
		}
		
	}
	
	
