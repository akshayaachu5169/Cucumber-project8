package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import initializers.Intializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import preconditions.DriverFunctions;

public class LoginTest {
public	WebDriver wd;

	@Given("open browser as {string}")
	public void openbrowser(String browser) {
	wd=Intializer.openbrowser(wd, browser);
	}

	@When("enter url as {string}")
	public void enterurlas(String url) {
		DriverFunctions.loadurl(wd, url);
	}

	@And("enter username as {string}")
	public void enterusername(String username) {
		LoginPage.enterusername(wd, username);
	}

	@When("enter password as {string}")
	public void enterpassword(String password) {
		LoginPage.enterpassword(wd, password);
	}

//	@And("click login button")
//	public void clickloginbutton() {
//		LoginPage.clickloginbutton(wd);
//	}

	@When("click sign up")
	public void signup() {
		LoginPage.signup(wd);
	}

	@Then("verify the welcome page as {string} in header")
	public void verifythewelcomepage(String welcomemsg) {
		System.out.println(wd.getTitle() + welcomemsg);
	}

	@But("dont click remember password")
	public void dontclickrememberpassword() {
		System.out.println("---dont click remember password---");
	}

}
