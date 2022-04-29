package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.manage().window().maximize();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
  String text = driver.findElement(By.xpath("//div[@id='form']//h2")).getText();
 System.out.println(text);
  driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
  driver.findElement(By.xpath("//a[text()='Leads']")).click();
  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Athira");
  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("GS");
  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
}
	
}