import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	   System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText());
	   String name=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
	  // driver.findElement(By.id("dropdown-class-example")).click();
	   Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
	   s.selectByVisibleText(name);
	  
	   driver.findElement(By.cssSelector("input#name")).sendKeys(name);
	   driver.findElement(By.cssSelector("input#alertbtn")).click();
	   String text=driver.switchTo().alert().getText();
	   
	   if(text.contains(name))
	   {
		   System.out.println("It contains the same text");
	   }
	   else
	   {
		   System.out.println("It doesn't contains the same text"); 
	   }
	  driver.switchTo().alert().accept();
		

	}

}
