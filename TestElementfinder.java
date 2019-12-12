package TestFolder_1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestElementfinder {
	public static WebDriver driver;
	static WebDriverWait wt;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\azirq\\Documents\\Selenium\\DriverForSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		wt = new WebDriverWait(driver, 20);
		
		WebElement logInlink = driver.findElement(By.linkText("Log In"));
		logInlink.click();
		WebElement userName = driver.findElement(By.id("si_popup_email"));
		userName.sendKeys("azirqa@gmail.com");
		Thread.sleep(1000);
		WebElement passWord = driver.findElement(By.id("si_popup_passwd"));
		passWord.sendKeys("123456789");
		WebElement submit = driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']"));
		submit.click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Blog")).click();

//		ArrayList<String> windowList = new ArrayList<String>(driver.getWindowHandles());	
//		driver.switchTo().window(windowList.get(1));
		try {
			driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		}catch(Exception e) {
			e.getStackTrace();
		}
		driver.findElement(By.linkText("Explore Online Courses")).click();
//		driver.close();
//		driver.switchTo().window(driver.getWindowHandle());

		ArrayList<String> windowList2 = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(windowList2);
////		System.out.println(windowList2.get(1));
		String mainWindow = windowList2.get(0);
		String window2 = windowList2.get(1);
//		String window3 = windowList2.get(2);
//
		driver.switchTo().window(window2).close();
		Thread.sleep(5000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		driver.navigate().back();
	Thread.sleep(5000);
		
		WebElement proLink = driver.findElement(By.xpath("//img[@class='user_image']"));
		wt.until(ExpectedConditions.elementToBeClickable(proLink));
		proLink.click();	
		driver.findElement(By.linkText("Log Out")).click();
	}

}
