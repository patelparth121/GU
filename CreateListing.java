import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateListing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='dropdownMenuLink']//img[@alt='user']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Create Listing')]")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".btn-link.camerabutton.button.mt-3")).click();


		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@id='b1']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Next']")).click();

		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//div[contains(text(),'Adventure & Sports')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mdc-chip__text'][normalize-space()='Adventure Sports']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@class='mdc-chip__text'][normalize-space()='Adventure']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//label[normalize-space()='Next']")).sendKeys(Keys.RETURN);
		


	}

}
