package seleiniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://letcode.in/buttons");
		
		//Click home button
		
		driver.findElement(By.id("home")).click();
		
		driver.navigate().refresh();
		
Thread.sleep(3000);

driver.navigate().forward();

Thread.sleep(3000);

driver.navigate().back();


Thread.sleep(3000);


driver.navigate().to("https://www.google.com/");

Navigation nav =   driver.navigate();


nav.back();

driver.quit();




		
		
		
		
	}

}
