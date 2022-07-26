package ass1AbsoluteXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromWebDriver {

	public WebDriver driver;

	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://learnenglish.britishcouncil.org/");

		// Maximize current window
		driver.manage().window().maximize();

		// Define the web element to find it,
		// using absolute XPath to locate and click on the ‘Register’ link
		WebElement absoluteXPathMethod = driver.
				findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/section[1]/nav[1]/ul[1]/li[2]/a[1]"));
		
		// click on web element
		absoluteXPathMethod.click();

		// Delay execution for 5 seconds after find specific web element
		// I used it to I can see the result carefully and for a screenshot.
		// Thread.sleep(5000);

		// Close the browser
		driver.quit();
	}
}
