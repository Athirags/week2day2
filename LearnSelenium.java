package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
}
}
