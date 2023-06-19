package preconditions;

import org.openqa.selenium.WebDriver;

public class DriverFunctions {

	public static void loadurl(WebDriver wd, String url) {
		wd.get(url);
	}
}
