import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asstables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//table[@id='product']"));
		WebElement tabel=driver.findElement(By.xpath("//table[@id='product']"));
	  //  int rowcount=driver.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).size();
	   // System.out.println(table.findElements(By.tagName("tr")).size());

	}

}

