package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
	WebDriver driver;
	public Frame(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@title='streamlitApp']")
	WebElement frame;
	
	public void enterIntoFrame() {
		driver.switchTo().frame(frame);
	}

}
