import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("hello");
		
	//	Actions a=new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).contextClick().build().perform();
		
		
		

	}

}
