package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		driver.findElement(By.xpath("//option[text()='Myself']")).click();
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Bhargavi");
		driver.findElement(By.xpath("//input[@id='genderfemale']")).click();
		driver.findElement(By.xpath("//select[@id='DOBDAY']")).click();
		driver.findElement(By.xpath("//option[text()='20']")).click();
		driver.findElement(By.xpath("//select[@id='DOBMONTH']")).click();
		driver.findElement(By.xpath("//option[text()='Feb']")).click();
		driver.findElement(By.xpath("//select[@id='DOBYEAR']")).click();
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		driver.findElement(By.xpath("//select[@id='RELIGION']")).click();
		driver.findElement(By.xpath("//option[text()='Hindu']")).click();
		driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")).click();
		driver.findElement(By.xpath("//option[text()='Tamil']")).click();
		driver.findElement(By.xpath("//select[@id='COUNTRY']")).click();
		driver.findElement(By.xpath("//option[text()='India']")).click();
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("6383167170");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("srinivasbhargavi5@gmail.com");
		Thread.sleep(2000);
		driver.close();
	}

}
