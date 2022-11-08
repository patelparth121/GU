import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
	}

}

