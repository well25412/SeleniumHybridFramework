package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	public void dropDown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseHove(WebDriver driver,WebElement ele) {
     Actions a = new Actions(driver);
     a.moveToElement(ele).perform();
}
	public void doubleClick(WebDriver driver,WebElement ele) {
	     Actions a = new Actions(driver);
	     a.moveToElement(ele).perform();
	     	}
	public void dragDrop(WebDriver driver,WebElement source,WebElement target) {
	     Actions a = new Actions(driver);
	     a.dragAndDrop(source,target).perform();
	     	}
	public void switchFrames(WebDriver driver) {
	     Actions a = new Actions(driver);
	    driver.switchTo().frame(0);
	     	}
	public void switchBackFrames(WebDriver driver) {
	     Actions a = new Actions(driver);
	    driver.switchTo().defaultContent();
	     	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert();
	}
	
	public void switchingTabs(WebDriver driver) {
		Set<String> child =driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
			
		}}
		public void scrollBar(WebDriver driver,int x,int y)
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeAsyncScript("window.scrollBy("+x+","+y+")");
		}
	
}