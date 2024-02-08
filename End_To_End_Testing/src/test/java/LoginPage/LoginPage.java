package LoginPage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Throwable {
		broserLaunch();
		productSelecting();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public static void broserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("aranganambi.elumalai@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Eras@12345");
		driver.findElement(By.id("login")).click();
	}

	public static void productSelecting() throws Throwable {
		String[] itemNeeded = { "IPHONE 13 PRO", "ADIDAS ORIGINAL", "ZARA COAT 3", "ADIDAS ORIGINAL" };
		List<String> itemNeededList = Arrays.asList(itemNeeded);
		int j = 0;
		List<WebElement> elements = driver.findElements(By.xpath("//div/div/div/div[1]/h5/b"));

		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();

			if (itemNeededList.contains(text)) {

				driver.findElements(By.xpath("//div/div/div/div[1]/div/button[2]")).get(i).click();

				Thread.sleep(3000);
				j++;
			}

			if (j == itemNeeded.length) {
				System.out.println(j);
				break;
			}

		}
		System.out.println("items added successfully");
	}

}
