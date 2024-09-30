package in.gopocket.generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass()
	public void OpenBrowser(String browser) throws IOException {

		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		}
		FileLib file= new FileLib();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(file.getData_PropertyFile("Url"));
	}

	@AfterClass
	public void close_browser() {
		driver.quit();
	}
	
	public void TakeScreenShot(String res)
	{	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+res+".png");
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("Successfully Captured ScreenShot");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
