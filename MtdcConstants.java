package asssignment;

import org.openqa.selenium.By;

public interface MtdcConstants {
	
	By FIND_A_ROOM  = By.xpath("//*[@id=\'find-a-room\']/div[1]/span");
	By CLICK_ON_DATE1  = By.xpath("//*[@id=\'input-group-9\']/div/div[3]/div[2]/div[2]/div[1]/div[21]/div/div/div");
	By CLICK_ON_DATE2  = By.xpath("//*[@id=\'input-group-9\']/div/div[3]/div[2]/div[2]/div[1]/div[23]/div/div/div/span");
	By GUESTS_BUTTON  = By.xpath("//*[@id=\'input-1\']");
	By ADULTS_ADDER = By.xpath("//*[@id=\'input-group-4\']/div/div/div[1]/div[2]/div/button[2]");
	By BLANK_SPACE  = By.xpath("//*[@id=\'input-group-4\']");
	By CHECK_AVAILABILITY_BUTTON  = By.xpath("//*[@id=\'about\']/div/div/div[2]/div/div/div/form/button");
	By CLICK_ON_BLANK_SPACE  = By.xpath("//*[@id=\'chardonnay\']");
	By SELECT_ROOM_BUTTON  = By.xpath("//*[@id=\'addonBtn66481\']");
	By ROOM_ADDER  = By.xpath("//*[@id=\'addCount66481\']/div/div[2]/button");
	By CHECK_OUT_BUTTON  = By.xpath("//*[@id=\'nav-collapse\']/ul/button");
	By BLANK_SPACE_2  = By.xpath("//div[@id='accordion-3']/div/p/div/p");
	By CONFIRM_AND_PAY_BUTTON  = By.xpath("(//button[@type='button'])[10]");
	String CHROME_DRIVER_PATH = "C:\\Users\\GoComet\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
	public String baseUrl = "http://mtdc.letschbang.com/stays/mtdc-nagpur";
	
}
