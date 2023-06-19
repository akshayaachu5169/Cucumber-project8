package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class LoginPage {

	public static void validateTitle(WebDriver wd, String expected) {

		String actual = wd.getTitle();
		Assert.assertEquals(expected, actual);
	}

	public static void enterusername(WebDriver wd , String username) {
		wd.findElement(By.name("username")).sendKeys(username);
	}

	public static void enterpassword(WebDriver wd , String password) {
		wd.findElement(By.name("password")).sendKeys(password);
	}
//	public static void clickloginbutton(WebDriver wd) {
//		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
//	}

	public static void signup(WebDriver wd) {
		wd.findElement(By.linkText("Sign Up Now")).click();
	}
	
}
