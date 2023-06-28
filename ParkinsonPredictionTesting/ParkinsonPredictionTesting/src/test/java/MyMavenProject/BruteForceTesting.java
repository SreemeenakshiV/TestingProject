package MyMavenProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjectModel.ErasePreviousContent;
import PageObjectModel.Frame;
import PageObjectModel.textBoxLocators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BruteForceTesting {
	
	@Test(priority=1)
	public void Launch_Test() throws IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  bt.browserTerminationTest();
	}
	
	@Test(priority=2)
	public void Frame_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=3)
	public void TB1_Test() throws IOException, InterruptedException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  bt.browserTerminationTest();
	}
	
	@Test(priority=4)
	public void TB2_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxTwo();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=5)
	public void TB3_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxThree();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=6)
	public void TB4_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxFour();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=7)
	public void TB5_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxFive();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=8)
	public void TB6_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxSix();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=9)
	public void TB7_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxSeven();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=10)
	public void TB8_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxEight();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=11)
	public void TB9_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxNine();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=12)
	public void TB10_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxTen();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=13)
	public void TB11_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxEleven();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=14)
	public void TB12_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxTwelve();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=15)
	public void TB13_Test() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxThirteen();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=16)
	public void Integrate_Test1() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=17)
	public void Integrate_Test2() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=18)
	public void Integrate_Test3() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=19)
	public void Integrate_Test4() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=20)
	public void Integrate_Test5() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=21)
	public void Integrate_Test6() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=22)
	public void Integrate_Test7() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=23)
	public void Integrate_Test8() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=24)
	public void Integrate_Test9() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  tbl.textBoxTen();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=25)
	public void Integrate_Test10() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  tbl.textBoxTen();
		  tbl.textBoxEleven();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=26)
	public void Integrate_Test11() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  tbl.textBoxTen();
		  tbl.textBoxEleven();
		  tbl.textBoxTwelve();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
	@Test(priority=27)
	public void Integrate_Test12() throws InterruptedException, IOException {
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  tbl.textBoxTen();
		  tbl.textBoxEleven();
		  tbl.textBoxTwelve();
		  tbl.textBoxThirteen();
		  Thread.sleep(1000);
		  bt.browserTerminationTest();
	}
	
     @Test(priority=28)
	public void Final_Test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  BaseTest bt = new BaseTest();
		  WebDriver driver = bt.initializeDriver();
		  bt.hit();
		  Thread.sleep(8000);
		  Frame f = new Frame(driver);
		  f.enterIntoFrame();
		  Thread.sleep(9000);
		  textBoxLocators tbl = new textBoxLocators(driver);
		  tbl.textBoxOne();
		  tbl.textBoxTwo();
		  tbl.textBoxThree();
		  tbl.textBoxFour();
		  tbl.textBoxFive();
		  tbl.textBoxSix();
		  tbl.textBoxSeven();
		  tbl.textBoxEight();
		  tbl.textBoxNine();
		  tbl.textBoxTen();
		  tbl.textBoxEleven();
		  tbl.textBoxTwelve();
		  tbl.textBoxThirteen();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@class='css-1x8cf1d edgvbvh10']")).click();
		  bt.browserTerminationTest();
//		  System.out.println(textBox1.getAttribute("value"));
	}

}
