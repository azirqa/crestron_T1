package resourcePackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeShotTest {
static WebDriver driver;
static String url = "https://www.google.com/maps";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\azirq\\Documents\\Selenium\\DriverForSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    screenShot("Google Map");
	    driver.quit();
		
		
	}
    public static void screenShot(String fileName) {
    	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(
					"C:\\Users\\azirq\\Documents\\Selenium\\AmazonProject\\src\\test\\java\\resourcePackage\\ScreeShotTest.java"
							+ fileName + ".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Check Screenshot under >src/test/java >resourcePakage ");
		
	}

}
