package MyMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties() ;
		FileInputStream fis = new FileInputStream("C:\\Users\\sarav\\seleniumTesting\\ParkinsonPredictionTesting\\src\\main\\java\\Resources\\Test.properties");
		prop.load(fis);
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser") : prop.getProperty("browser");
		//String browserName = prop.getProperty("browser");
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 ChromeOptions options = new ChromeOptions(); 
			  options.addArguments("--remote-allow-origins=*");
			  options.setAcceptInsecureCerts(true);
			   driver = new ChromeDriver(options);
			   driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			
		}
		else if(browserName.equalsIgnoreCase("edge")){
			
		}
		
		return driver;
		
	}
	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file =new File(System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	}
	
	public void hit() {
		driver.get("https://vidya-ak-14-parkinsons-disease-dete-parkinsons-detection-5elq8g.streamlit.app/");
	}
	public void browserTerminationTest() {
		driver.quit();
	}

}
