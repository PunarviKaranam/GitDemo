import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-s1-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
       WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
      int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
      int colcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
      for(int i=0;i<colcount-2;i++)
      {
    	 String val=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
    	 int valInt=Integer.parseInt(val);
    	 sum=sum+valInt;
      }
     // System.out.println(sum);
      String ext=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
      int extInt=Integer.parseInt(ext);
      int total=sum+extInt;
      System.out.println(total);
      System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
   
	}

}
