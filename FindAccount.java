package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:/leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text = driver.findElement(By.tagName("h2")).getText();
      System.out.println(text);
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Accounts")).click();
      driver.findElement(By.linkText("Find Accounts")).click();
      driver.findElement(By.xpath("//input[@name='id']")).sendKeys("13037");  
      driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Debitlimitedaccount");
      driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
      driver.findElement(By.linkText("Debitlimitedaccount")).click();
      driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
      String text1=driver.findElement(By.xpath("(//input[@name='accountName'])[1]")).getAttribute("value");
      System.out.println(text1);
      String text2=driver.findElement(By.xpath("//textarea[@name='description']")).getText();
      System.out.println(text2);
      System.out.println("The Title is:"+driver.getTitle());
}
}
