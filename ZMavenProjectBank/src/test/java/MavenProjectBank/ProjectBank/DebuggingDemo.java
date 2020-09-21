package MavenProjectBank.ProjectBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DebuggingDemo {
	
	WebDriver driver;
	
@Test
	public void logingt() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")).click();
		driver.findElement(By.id("appointmentschedulingui-manageAppointmentTypes-app")).click();
	WebElement e=	driver.findElement(By.xpath("//table[@id='appointmentTypesTable']//tbody//tr[1]/"));
		String output= e.getText();
		System.out.println(output);
		
	}

  
   }

