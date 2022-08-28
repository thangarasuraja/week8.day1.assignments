package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData2;


public class ProjectSpecificMethods {
	public String excelFileName="";
	public static int i=1;
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver=new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		
		return remoteWebDriver.get();
	}
	//public static ChromeDriver driver;
	
	
	
	
	@BeforeMethod
	public void init() {
		launchBrowser();
		loadAndMaximize();
	}
		
		public void loadAndMaximize() {
			getDriver().get("http://leaftaps.com/opentaps/control/login");
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
		
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			setDriver();
			
			//driver=new ChromeDriver();
			
		}
		
		@AfterMethod
		public void browserClose()  {
			getDriver().close();
		}
		
		@DataProvider(name="fetch")
		public String[][] fetchData() throws IOException{
			
			String [][] data=ReadExcelData2.readData(excelFileName);
			return data;
			
		}

}
