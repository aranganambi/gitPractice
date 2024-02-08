package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_And_ForgorPassword extends Base_Class {

	public static void main(String[] args) {
		System.out.println("Starting chrome driver");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Home\\eclipse-workspace\\RahulShettyAcademy\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}

