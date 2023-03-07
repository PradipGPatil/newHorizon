package implimentation.commonDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {
	
	WebDriver driver;
	
	public CommonDriver( String browserType) throws Exception {
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browserType.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();

		}
		else {
			throw new Exception(" invalid browser");
		}
	}
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public String pageTitle() {
		
		return (driver.getTitle());
	}

}
