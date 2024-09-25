package seleiniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_MoveToElementExamples {
	
	public static void main(String[] args) {
	
	

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();





	WebElement electronicsOption = 		driver.findElement(By.xpath("//img[@alt='Electronics']"));

	Actions builder = new Actions(driver);

	builder.moveToElement(electronicsOption).perform();

	driver.findElement(By.linkText("Soundbars")).click();


	
	

}

}
