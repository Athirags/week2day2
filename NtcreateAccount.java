package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NtcreateAccount {
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
      driver.findElement(By.xpath("//select[@id='currencyUomId']")).sendKeys("Indian Rupee");
      driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
      driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("any");
      driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("tac");
      driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
      System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
}
}
