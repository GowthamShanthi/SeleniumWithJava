package seleiniumBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExampls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://letcode.in/buttons");


		
		//Take screen shot of whole page 

		File sourcefile =  driver.getScreenshotAs(OutputType.FILE);

		String Wholepageimage = "Wholepage"+System.nanoTime();
		
		File dest = new File("./snaps"+File.separator+Wholepageimage+".png");	

		FileHandler.copy(sourcefile, dest);

		
		//Take screen shot of particular element 
		
		 WebElement button1 =    driver.findElement(By.id("position"));
		
		File sourcefile1 =  button1.getScreenshotAs(OutputType.FILE);
		
		String buttonimagename = "button"+System.nanoTime();

		File dest1 = new File("./snaps"+File.separator+buttonimagename+".png");

		FileHandler.copy(sourcefile1, dest1);
		
		
		driver.quit();
		
		
		//Take screen shot of particular element 









	}

}
