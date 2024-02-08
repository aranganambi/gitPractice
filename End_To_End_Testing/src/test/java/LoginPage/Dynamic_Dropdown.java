package LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Dropdown {
	@Test
	public static void dynamic_Dropdown () {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[text()='Sign up for Facebook']")).click();
		driver.findElement(By.id("month")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div/span/span/select[2]/option"));
		
		String month = "mar";
		Select drop = new Select(driver.findElement(By.id("month")));
		for(int i=0; i<elements.size(); i++) {
			String month2= elements.get(i).getText();
			
			if (month2.equalsIgnoreCase(month)) {
				
				drop.selectByVisibleText(month2);
				System.out.println(month2);
			}
		}
	}
}
