package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bhargavi");
		driver.findElement(By.name("lastname")).sendKeys("Srinivas");
		driver.findElement(By.name("reg_email__")).sendKeys("bhargavisrinivas5@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("9346");
		driver.findElement(By.xpath("//select[@id='day']")).click();
		driver.findElement(By.xpath("//option[text()='20']")).click();
		driver.findElement(By.xpath("//select[@id='month']")).click();
		driver.findElement(By.xpath("//option[text()='feb']")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.close();
		

}

}