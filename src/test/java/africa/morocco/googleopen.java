package africa.morocco;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleopen {
	
	@Test
	
	public static void opening()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		String URL="https://www.google.com/";
		
		dr.get(URL);
		dr.manage().window().maximize();
		
	}

}
