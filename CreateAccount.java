package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
	      System.out.println(text);
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Accounts")).click();
	      driver.findElement(By.linkText("Create Account")).click();
	      driver.findElement(By.id("accountName")).sendKeys("Debitlimitedaccount");
	      driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Debit");
	      driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Leaftaps.com");
	      driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("2000000");
	      driver.findElement(By.className("smallSubmit")).click();
	      
	}

}
