import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		
//		Chat Send Message
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='app']/div[@class='app-top-box']/div[@class='chatSection']/div[@class='chatPopWrap']/div[@class='chatPop']/div[@class='chatPopInner']/div[@class='msg']/img[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@placeholder='Type a contact name']")).sendKeys("G");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@placeholder='Type a contact name']")).sendKeys("U");
//		driver.findElement(By.xpath("//input[@placeholder='Type a contact name']")).sendKeys(Keys.RETURN);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@placeholder='Type message']")).sendKeys("Life");
//		driver.findElement(By.xpath("//div[@class='send-icon']")).click();
//	
		
		
	}

}
