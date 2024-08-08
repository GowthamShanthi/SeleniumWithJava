package locatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://letcode.in/");
		//clicking login button
		driver.findElement(By.linkText("Log in")).click();
		
		//Entering Email addres
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gowtham.shanthi@gmail.com");
		
		//Entering Password
		driver.findElement(By.name("password")).sendKeys("May2321%^%^");
		
		 
		
		//CLicking lOgin button 
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		

		
		
				
	}

}
