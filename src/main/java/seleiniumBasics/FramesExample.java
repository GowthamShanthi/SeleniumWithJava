package seleiniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

		driver.switchTo().frame("iframeResult");


		WebElement trybutton = driver.findElement(By.xpath("//button[text()='Try it']"));
		trybutton.click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Namachivaya Vaalga");
		alert.accept();


		WebElement pastedtext = driver.findElement(By.xpath("//p[@id='demo']"));

		System.out.println("The pasted text is "+pastedtext.getText());





	}

}
