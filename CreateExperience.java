import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateExperience {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		
		driver.findElement(By.cssSelector(" button[type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.get("https://www.globallyunited.com/createpost");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Add your post title']")).sendKeys("New Post");
		driver.findElement(By.xpath("//textarea[@id='postDescription']")).sendKeys("Description Text");
		driver.findElement(By.xpath("//body/div[@role='dialog']/div[@id='createpost']/div[@class='modal-content']/div[@class='modal-body']/div[@id='load-effect']/div[@class='row']/div[@class='col-md-8']/div[@class='row']/div[@class='col-md-12']/div/div[@class='col-sm-12 col-md-12 col-lg-12 col-xl-12 experienceDetailPage']/div[@class='mdc-chip-set mdc-chip-set--filter']/div[1]")).click();
		driver.findElement(By.xpath("//input[@id='googlepplace']")).sendKeys("India");
		
		Thread.sleep(2);
		
		driver.findElement(By.xpath("//div[@class='pac-container pac-logo']//div[3]")).click();
		driver.findElement(By.xpath("//input[@id='googlepplace']")).click();
		driver.findElement(By.cssSelector(".btn-link.camerabutton.button.ml-4.width200")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='googlepplace']")).click();
		driver.findElement(By.xpath("//label[@for='photoVideo']")).sendKeys("D:\\images\\download.jpg");
		
		driver.findElement(By.cssSelector(".btn-link.camerabutton.button.ml-4.width200")).click();
		

		}

}
