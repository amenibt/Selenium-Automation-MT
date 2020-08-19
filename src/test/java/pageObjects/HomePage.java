package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getApplicationUrl() + "/login");
	}

	@FindBy(how = How.CSS, using = "#username")
	private WebElement userName;
	@FindBy(how = How.CSS, using = "#password")
	private WebElement password;

	public void enter_Username() {
		userName.sendKeys("tomsmith");
	}
	public void enter_Password() {
		password.sendKeys("SuperSecretPassword!");
	}
}