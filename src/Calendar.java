import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).getText().contains("August"))
		{
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
	
		
		List<WebElement> dates=driver.findElements(By.cssSelector("td.day"));
		int count=driver.findElements(By.cssSelector("td.day")).size();
		for(int i=0;i<count;i++)
		{
			String dt=driver.findElements(By.cssSelector("td.day")).get(i).getText();
			if(dt.equalsIgnoreCase("19"))
			{
				driver.findElements(By.cssSelector("td.day")).get(i).click();
				break;
			}
		}

	}

}
