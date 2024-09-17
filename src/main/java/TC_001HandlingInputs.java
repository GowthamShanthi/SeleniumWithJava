import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get( "https://letcode.in/edit");
		
		//Enter FUll name
		
 
		driver.findElement(By.id("fullname")).sendKeys("GowthamV");
		
		
	}

}
