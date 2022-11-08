import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyExperiencePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		Thread.sleep(5000);

		driver.get("https://www.globallyunited.com/userexperience");

		
		Thread.sleep(15000);
		
		
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)","");

//		Select the Interest Filter
//		driver.findElement(By.xpath("//a[@id='6']//div[@class='interests']")).click();

		
//		Country Filter Selection
		driver.findElement(By.xpath("//span[normalize-space()='Country']")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js1= (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,400)","");
		
		driver.findElement(By.xpath("//input[@id='autoInputField']")).sendKeys("India");
		driver.findElement(By.xpath("//label[normalize-space()='Filter']")).click();

//		Insert Filter Selection
//		driver.findElement(By.xpath("//span[normalize-space()='Interests']")).click();
//		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
//		driver.findElement(By.xpath("//button[@as='[object Object]']//label[@class='display-font pointer'][normalize-space()='Filter']")).sendKeys("India");

//		Open Three dot menu
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")).click();;
		
//		Follow/Unfollow
//		driver.findElement(By.xpath("//a[normalize-space()='Follow']")).click();;
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//label[normalize-space()='Unfollow']")).click();;

//		Report the Post
//		driver.findElement(By.xpath("//a[normalize-space()='Report Post']")).click();;
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//span[normalize-space()='Spam']")).click();;
//		driver.findElement(By.xpath("//label[normalize-space()='Submit']")).click();;

//		driver.findElement(By.xpath("//label[normalize-space()='Close']")).click();;
		
//		Select Interest from Post Image	
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/label[1]")).click();

	
	}
	
	
}
