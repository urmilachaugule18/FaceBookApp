package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
public static WebDriver driver;
public static void initilization(String browsername) {
	if(browsername.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else if(browsername.equalsIgnoreCase("--headless")) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
	}
	else if(browsername.equalsIgnoreCase("--incognito")) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
	}
	else {
		System.err.println("Please Select Proper BrowserName");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/reg");
	}
}
