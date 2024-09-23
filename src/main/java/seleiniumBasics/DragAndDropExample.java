package seleiniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		
		
		
WebElement sourceElement = driver.findElement(By.id("text"));

WebElement targetElement = driver.findElement(By.id("droppable"));

Actions builder = new Actions(driver)

builder.dragAndDrop(sourceElement, targetElement).perform();


		
		

		
		

	}

}
