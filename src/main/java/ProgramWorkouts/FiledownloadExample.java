package ProgramWorkouts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiledownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.get("https://leafground.com/file.xhtml" );

driver.manage().window().maximize();


WebElement dwnldbutton = driver.findElement(By.xpath("//span[text()=\"Download\"]"));
dwnldbutton.click();

File filelocation = new File("C:\\Users\\gowthamv\\Downloads");

File[] allfilelist =    filelocation.listFiles();


for (File file : allfilelist) {
	
	if(file.getName().contains("TestLeaf Logo"))
	{
		System.out.println("The file downloded succesfully ");
		break;
	}
	
	
}
 

driver.quit();




	}

}
