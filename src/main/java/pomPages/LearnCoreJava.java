package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnCoreJava {
	@FindBy(xpath = "//a[text()='X']")
    private WebElement alert;
   @FindBy(xpath ="//div[@class='play-icon']")
	 private WebElement playiconbtn;
	
	@FindBy(xpath ="//div[@class='pause-icon']")
	 private WebElement pauseiconbtn;
	
	@FindBy(xpath ="//span[text()='Add To Wishlist']")
	 private WebElement AddWishbtn;
	
		
public LearnCoreJava(WebDriver driver) {
PageFactory.initElements(driver,this);
}

public void popup(){
	alert.click();
}
public void playicon(){
	playiconbtn.click();
}
public void pauseicon(){
	pauseiconbtn.click();
}
public void AddWish(){
	AddWishbtn.click();
}



}
