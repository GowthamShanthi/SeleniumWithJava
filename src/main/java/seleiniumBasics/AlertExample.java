package seleiniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://letcode.in/alert");



		//Simple alert - Accept the Alert

		WebElement SimpleAlertButton =  driver.findElement(By.id("accept"));
		SimpleAlertButton.click();

		Alert alert = 	driver.switchTo().alert();
		System.out.println("The first alert text is"+alert.getText());
		alert.accept();


		//Confirm alert 

		WebElement ConfirmAlertButton =  driver.findElement(By.id("confirm"));
		ConfirmAlertButton.click();
		System.out.println("The Second alert text is"+alert.getText());
		alert.accept();



		//Prompt Alert 
		WebElement PromptAlertButton = driver.findElement(By.id("prompt"));
		PromptAlertButton.click();
		System.out.println("The Third alert text is"+alert.getText());
		alert.sendKeys("Namachivaaya Vaalga");
		alert.accept();


		//Print the displayed name after prompt alert

		WebElement printedname = driver.findElement(By.id("myName"));
		System.out.println(printedname.getText());



		//Modern Alert / Sweet Laert Test
		WebElement ModernAlertButton = driver.findElement(By.id("modern"));
		ModernAlertButton.click();

		WebElement modernalertelement = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p"));
		System.out.println(modernalertelement.getText());




	}

}
