package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchWindowToChild() {
		Set<String> window = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(window);
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
	}
}
