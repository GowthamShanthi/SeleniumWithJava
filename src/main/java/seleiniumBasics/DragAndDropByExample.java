package seleiniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/draggable");
		driver.manage().window().maximize();

		WebElement SourceElement = driver.findElement(By.id("sample-box"));

		int x = SourceElement.getLocation().getX();
		int y = SourceElement.getLocation().getY();


		Actions builder = new Actions(driver);
		builder.dragAndDropBy(SourceElement, 9, y+30).perform();


















	}

}
