import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWatch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(" button[type='submit']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[@id='dropdownMenuLink']//img[@alt='user']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Create Watch')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Add your post title']")).sendKeys("Title");
		driver.findElement(By.xpath("//textarea[@id='postDescription']")).sendKeys("Description");
	
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//div[contains(text(),'Budget')]")).click();
		driver.findElement(By.xpath("//div[@class='mdc-chip__text'][normalize-space()='Adventure']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='googlepplace']")).sendKeys("India");
		driver.findElement(By.xpath("(//button)[65]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='googlepplace']")).click();
		
		
		
		driver.findElement(By.xpath("(//button)[65]")).click();
		driver.findElement(By.xpath("//input[@id='watchVideoUpload']")).sendKeys("D:\\images\\video.mp4");

		driver.findElement(By.xpath("(//button)[65]")).click();
	}

}
