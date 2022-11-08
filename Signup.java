import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Signup {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.globallyunited.com/signup");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Parth");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Patel");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tx@yopmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");

		WebElement StaticDropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/select[1]"));
		Select dropdown =new Select(StaticDropdown);
		dropdown.selectByIndex(0);
		
		WebElement StaticDropdown1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/div[1]/select[1]"));
		Select dropdown1 =new Select(StaticDropdown1);
		dropdown1.selectByIndex(2);
		
		WebElement StaticDropdown2 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[3]/div[1]/select[1]"));
		Select dropdown2 =new Select(StaticDropdown2);
		dropdown2.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@value='MALE']")).click();
		
		driver.findElement(By.xpath("//input[@id='autoInputField']")).sendKeys("India");
		driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(14) > ul:nth-child(2) > li:nth-child(1)")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[normalize-space()='SIGN UP']")).sendKeys(Keys.RETURN);

}


}