package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsBasics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/main");
      driver.manage().window().maximize();
      WebElement elementUsername=driver.findElement(By.id("username"));
      elementUsername.sendKeys("Demosalesmanager");
      driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      String text = driver.findElement(By.tagName("h2")).getText();
      System.out.println(text);
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Athira");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GS");
      driver.findElement(By.className("smallSubmit")).click();
      
      
     
		
	}

}
