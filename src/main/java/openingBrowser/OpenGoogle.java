package openingBrowser;

import javax.print.attribute.standard.Chromaticity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		/*	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	 FirefoxDriver driver = new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		
*/
	}

}
