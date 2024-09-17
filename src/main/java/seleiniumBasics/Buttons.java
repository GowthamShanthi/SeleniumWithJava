package seleiniumBasics;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://letcode.in/buttons");


		//Get X and Y co-ordinates

		Point button1 =    driver.findElement(By.id("position")).getLocation();

		System.out.println("The X co-ordinate of the button is "+button1.getX());

		System.out.println("The Y co-ordinate of the button is "+button1.getY());

		// Find the color of the button

		String buttoncolor = 	driver.findElement(By.id("color")).getCssValue("color");
		System.out.println("The color code ofthe buttons is"+buttoncolor);


		//Find the height & width of the button

		org.openqa.selenium.Dimension buttonsize = 		    driver.findElement(By.id("property")).getSize();

		System.out.println("The height of the button is "+buttonsize.getHeight());

		System.out.println("The height of the button is "+buttonsize.getWidth());





		//Confirm button is disabled

		boolean isbuttonenabled = 	    driver.findElement(By.id("isDisabled")).isEnabled();

		System.out.println("The button enabled status is"+isbuttonenabled);





		//Click and Hold Button
		WebElement button4 = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));

		Actions action = new Actions(driver);
		action.moveToElement(button4).clickAndHold().build().perform();

		Thread.sleep(5000);

		WebElement newbutton = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]/div/h2"));







		System.out.println("The new text is "+newbutton.getText());





	}

}
