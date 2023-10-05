package seliium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SELAk {
	public static void main(String[] args) throws InterruptedException{
		 
		 
		 System.setProperty("webdriver.chrome.driver","C:/Users/Kiran/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver ak=new ChromeDriver();
		 ak.get("https://www.amazon.in/");
		 Thread.sleep(5000);
		 ak.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		 ak.findElement(By.id("nav-search-submit-button")).click(); 
		 ak.navigate().to("https://www.linkedin.com/feed/");
		 String name=ak.getCurrentUrl();
		 System.out.println(name);
         ak.navigate().back();
		 ak.navigate().forward();
		 ak.navigate().refresh();
		 ak.close();
		
	}
}