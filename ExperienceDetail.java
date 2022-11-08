import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExperienceDetail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		Thread.sleep(2000);

		driver.get("https://www.globallyunited.com/experience/100004108/mumbai");
		Thread.sleep(5000);
		
		
		
//		Comment
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//      js.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//textarea[@placeholder='Write a comment..']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//i[@class='far fa-paper-plane']")).click();
//
//		Delete Comment
//		JavascriptExecutor js1= (JavascriptExecutor) driver;
//      js1.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//textarea[@placeholder='Write a comment..']")).sendKeys("Test@123");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//i[@class='far fa-paper-plane']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(".fas.fa-ellipsis-h.p-0")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[normalize-space()='Delete Comment']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@role='dialog']//button[2]")).click();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		JavascriptExecutor js2= (JavascriptExecutor) driver;
//      js2.executeScript("window.scrollBy(0,500)","");
	
		
	}

}
