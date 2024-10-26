package fivrstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases {
	WebDriver driver = new ChromeDriver();

String myWebsite = "https://magento.softwaretestingboard.com/";

String myWebsite2 = "https://www.google.com";

@BeforeTest
public void mySetup() throws InterruptedException {

	driver.manage().window().maximize();
	driver.get(myWebsite);
//	driver.navigate().to(myWebsite2);
//	driver.navigate().back();
//	driver.navigate().forward();
//	System.out.println(driver.getCurrentUrl().toUpperCase());llllllllllllllllllllll
//	System.out.println(driver.getTitle());
//	Thread.sleep(5000);
//driver.navigate().refresh(); 

}

@Test(priority = 1)
public void signUp() throws InterruptedException {

	// take the full text only work with the (a)tag
	driver.findElement(By.linkText("Create an Account")).click();

	Thread.sleep(5000);

	driver.navigate().refresh();

	// //take the part of the text only work with the (a)tag eza mtkasel w mosh 7abb
	// tktob el klmeh kamleh
	driver.findElement(By.partialLinkText("Create an Account")).click();

	WebElement FirstNameInput = driver.findElement(By.id("firstname"));
	FirstNameInput.sendKeys("soso");
	WebElement LastNameInput = driver.findElement(By.id("lastname"));
	LastNameInput.sendKeys("ahmad");
	WebElement EmailInput = driver.findElement(By.id("email_address"));
	EmailInput.sendKeys("asdf99@gmail.com");
	WebElement PasswordInput = driver.findElement(By.id("password"));
	PasswordInput.sendKeys("ilovemyMom1233@744");
	WebElement ConfirmPasswordInput = driver.findElement(By.id("password-confirmation"));
	ConfirmPasswordInput.sendKeys("ilovemyMom1233@744");
	WebElement CreateAnAccountbutton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));

	CreateAnAccountbutton.click();
	;

}
	
	
	
	
}
	