import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateBucket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='dropdownMenuLink']//img[@alt='user']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Create Bucket')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bucket 2");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Bucket Description");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='modalFooter modal-footer']//button[2]")).click();

	}

}
