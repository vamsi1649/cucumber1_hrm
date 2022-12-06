package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 
	WebDriver driver;
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		WebDriverManager.chromedriver().setup();
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.name("username")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	 String k= driver.getTitle();
	  Assert.assertEquals(string, k);
	}
	
}
