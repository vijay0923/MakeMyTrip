package pageObject;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Setup;

public class Makemytrip extends Setup{
	
		
	public Makemytrip(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='selected']")
	WebElement oneway_radio;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	//@FindBy(xpath = "(//div[contains(.,'Delhi, India Delhi Airport')])[19]")
	WebElement from;
	
	//@FindBy(xpath = "(//div[contains(.,'Mumbai, India Chhatrapati Shivaji International Airport')])[19]")
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement to;
	
	
	
	
	public void clickOnOneway() {
		oneway_radio.click();
		//Select from =new Select(f);		
		//state.selectByVisibleText("Chennai");
		//from.selectByIndex("react-autowhatever-1-section-1-item-2");
		//from.selectByVisibleText("Delhi");
		
		//Select to =new Select(t);		
		//to.selectByIndex("react-autowhatever-1-section-0-item-0");
		//to.selectByVisibleText("Mumbai);
		
		//f.click();
		//t.click();
		//f.sendKeys("New Delhi");
		//t.sendKeys("Mumbai");
		
	}
	
	Actions a = new Actions(driver);
	
	
	public void fromto(Map<String,String> userDetails) {
		from.sendKeys(userDetails.get("From"));
		//from.findElement(By.xpath("//p[contains(.,'New Delhi, India')]")).click();
		a.moveToElement(driver.findElement(By.xpath("//p[contains(.,'New Delhi, India')]"))).click().build().perform();
		to.sendKeys(userDetails.get("To"));
		a.moveToElement(driver.findElement(By.xpath("//p[contains(.,'Mumbai, India')]"))).click().build().perform();
		//to.findElement(By.xpath("//p[contains(.,'Mumbai, India')]")).click();
	}
	

	}
