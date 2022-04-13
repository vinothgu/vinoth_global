package demo;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp_Test {
	WebDriver driver;
	  @Test
	  public void Login() {
		  driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
			driver.findElement(By.id("Password")).sendKeys("mass123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  boolean loginlink = driver.findElement(By.linkText("manz@mass.com")).isDisplayed();
		  Assert.assertEquals(true,loginlink );
		  }
	  
	  
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");  
		  
	  }
	  
	  

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	}