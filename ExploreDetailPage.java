import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreDetailPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

		driver.get("https://www.globallyunited.com/login");
		driver.findElement(By.xpath("//input[@placeholder='mail@website.com']")).sendKeys("txmavi69@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='min 8 characters']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".button.ml-12")).click();
		Thread.sleep(5000);

		driver.get("https://www.globallyunited.com/explore");
       	Thread.sleep(5000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='app']/div[@class='app-body']/div/div[@id='explorLandingContainer']/div[@class='row']/div[1]/img[1]")).click();

		Thread.sleep(2500);

//		Read More and Less
//		JavascriptExecutor js1= (JavascriptExecutor) driver;
//      js1.executeScript("window.scrollBy(0,500)","");
//	    Thread.sleep(2500);
//       
//	    driver.findElement(By.xpath("//span[@class='showMoreText font-montserrat-bold']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".showMoreText.font-montserrat-bold")).click();

		
//		Click on Filter Name for Open Filter Post List		
//		JavascriptExecutor js2= (JavascriptExecutor) driver;
//      js2.executeScript("window.scrollBy(0,600)","");
//		Thread.sleep(2500);
//		driver.findElement(By.cssSelector("img[src='https://content.globallyunited.com/static/interest/home/Adventure.png']")).click();

		
//		Open Filter's Post
//		JavascriptExecutor js3= (JavascriptExecutor) driver;
//      js3.executeScript("window.scrollBy(0,600)","");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='This weekend']")).click();
		
		
//		Like Filter's Post
//		JavascriptExecutor js4= (JavascriptExecutor) driver;
//      js4.executeScript("window.scrollBy(0,800)","");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/div[1]")).click();
	
//		Show More Filter Post Functionality
//		JavascriptExecutor js4= (JavascriptExecutor) driver;
//      js4.executeScript("window.scrollBy(0,1000)","");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(5) > img:nth-child(1)")).click();		
		
		
//		Open Community detail Page
//		JavascriptExecutor js5= (JavascriptExecutor) driver;
//      js5.executeScript("window.scrollBy(0,2000)","");
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > a:nth-child(1) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1)")).click();		
//		
		
//		Open Watch Post
//		JavascriptExecutor js6= (JavascriptExecutor) driver;
//		js6.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)")).click();		
//		
	}

}
