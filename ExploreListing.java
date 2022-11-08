import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreListing {

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
		
		
//		Searchbox
//		driver.findElement(By.xpath("//input[@id='autoInputField']")).sendKeys("Hello");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//img[@id='exploreSearchIcon']")).click();

//		Click On Explore Country
//		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='app']/div[@class='app-body']/div/div[@id='explorLandingContainer']/div[@class='row']/div[1]/img[1]")).click();

		
//		Like the Post
//		driver.findElement(By.xpath("(//button[@data-tip='Like'])[2]")).click();
	
//		Post Add to bucket
//	    JavascriptExecutor js= (JavascriptExecutor) driver;
//	    js.executeScript("window.scrollBy(0,1200)","");
//	    Thread.sleep(5000);
//		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > img:nth-child(1)")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.cssSelector(".css-1ivexr4-control")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("((//input[@role='combobox'])[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(".Component-modalButton-0-2-59.button.ml-2")).click();

//		Open Three dot menu
//		JavascriptExecutor js1= (JavascriptExecutor) driver;
//	    js1.executeScript("window.scrollBy(0,1200)","");
//	    driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)")).click();

//		Follow/Unfollow
//		driver.findElement(By.xpath("//a[normalize-space()='Follow']")).click();;
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//label[normalize-space()='Unfollow']")).click();;

//		Report the Post
//		driver.findElement(By.xpath("//a[normalize-space()='Report Post']")).click();;
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("")).click();;
//		driver.findElement(By.xpath("//label[normalize-space()='Submit']")).click();;
		
//		Open Community from Community Post
//		JavascriptExecutor js2= (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,2000)","");
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//span[@class='joinText font-montserrat-black']")).click();;

//		Open Experience Detail Page From Experience Post
//		JavascriptExecutor js3= (JavascriptExecutor) driver;
//      js3.executeScript("window.scrollBy(0,1200)","");
//		Thread.sleep(2500);
//      driver.findElement(By.xpath("//span[normalize-space()='dff']")).click();
		
//		Open Listing Detail Page From Listing Post
//		JavascriptExecutor js4= (JavascriptExecutor) driver;
//      js4.executeScript("window.scrollBy(0,2500)","");
//		Thread.sleep(2500);
//      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/div[2]/div[1]/button[1]/div[1]/span[1]/a[1]")).click();

//		Open Discovered Map
		driver.findElement(By.xpath("//div[contains(text(),'Discover the world map')]")).click();
		
		
		
		
		
	}
	
	

}
