package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErasePreviousContent {
	WebDriver driver;
	public ErasePreviousContent(WebDriver driver) {
		this.driver = driver;
	}

	
	public void eraseContent(WebElement element, String textToSend) throws InterruptedException {
		 for(int i=1; i<=4; i++) {
			  element.sendKeys(Keys.BACK_SPACE);  
		  }
		 Thread.sleep(500);
		 element.sendKeys(textToSend);
	}

}
