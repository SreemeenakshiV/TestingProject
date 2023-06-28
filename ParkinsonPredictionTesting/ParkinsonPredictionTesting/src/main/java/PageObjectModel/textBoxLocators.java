package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class textBoxLocators {
	ErasePreviousContent epc;
	WebDriver driver;
	public textBoxLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// WebElement textBox1 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Fo(Hz)']"));
	 //WebElement textBox2 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Fhi(Hz)']"));
	// WebElement textBox3 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Flo(Hz)']"));
	 //WebElement textBox4 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Jitterpercentage']"));
	// WebElement textBox5 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Jitter(Abs)']"));
	// WebElement textBox6 = driver.findElement(By.xpath("//input[@aria-label='MDVP_Shimmer ']"));
	// WebElement textBox7 = driver.findElement(By.xpath("//input[@aria-label=' NHR ']"));
	 //WebElement textBox8 = driver.findElement(By.xpath("//input[@aria-label='HNR']"));
	// WebElement textBox9 = driver.findElement(By.xpath("//input[@aria-label=' RPDE ']"));
	// WebElement textBox10 = driver.findElement(By.xpath("//input[@aria-label=' DFA ']"));
	 //WebElement textBox11 = driver.findElement(By.xpath("//input[@aria-label=' spread1 ']"));
	// WebElement textBox12 = driver.findElement(By.xpath("//input[@aria-label=' spread2 ']"));
	// WebElement textBox13 = driver.findElement(By.xpath("//input[@aria-label=' D2']"));
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Fo(Hz)']")
	 WebElement textBox1;
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Fhi(Hz)']")
	 WebElement textBox2;
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Flo(Hz)']")
	 WebElement textBox3;
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Jitterpercentage']")
	 WebElement textBox4;
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Jitter(Abs)']")
	 WebElement textBox5;
	 
	 @FindBy(xpath="//input[@aria-label='MDVP_Shimmer ']")
	 WebElement textBox6;
	 
	 @FindBy(xpath="//input[@aria-label=' NHR ']")
	 WebElement textBox7;
	 
	 @FindBy(xpath="//input[@aria-label='HNR']")
	 WebElement textBox8;
	 
	 @FindBy(xpath="//input[@aria-label=' RPDE ']")
	 WebElement textBox9;
	 
	 @FindBy(xpath="//input[@aria-label=' DFA ']")
	 WebElement textBox10;
	 
	 @FindBy(xpath="//input[@aria-label=' spread1 ']")
	 WebElement textBox11;
	 
	 @FindBy(xpath="//input[@aria-label=' spread2 ']")
	 WebElement textBox12;
	 
	 @FindBy(xpath="//input[@aria-label=' D2']")
	 WebElement textBox13;

	 
	 public void textBoxOne() throws InterruptedException {
		epc = new  ErasePreviousContent(driver);
		epc.eraseContent(textBox1, "119.992");
	 }
	 
	 public void textBoxTwo() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox2, "157.302");
		 }
	 
	 public void textBoxThree() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox3, "74.997");
		 }
	 
	 public void textBoxFour() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox4, "0.00784");
		 }
	 
	 public void textBoxFive() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox5, "0.00007");
		 }
	 
	 public void textBoxSix() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox6, "0.0037");
		 }
	 
	 public void textBoxSeven() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox7, "0.00554");
		 }
	 
	 public void textBoxEight() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox8, "0.01109");
		 }
	 
	 public void textBoxNine() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox9, "0.04374");
		 }
	 
	 public void textBoxTen() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox10, "0.426");
		 }
	 
	 public void textBoxEleven() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox11, "0.02182");
		 }
	 
	 public void textBoxTwelve() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox12, "0.0313");
		 }
	 
	 public void textBoxThirteen() throws InterruptedException {
		 epc = new  ErasePreviousContent(driver);
		 epc.eraseContent(textBox13, "0.02971");
		 }
}
