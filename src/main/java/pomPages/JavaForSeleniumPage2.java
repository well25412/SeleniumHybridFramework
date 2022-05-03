package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaForSeleniumPage2{

@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
        private WebElement firstlink;


  public JavaForSeleniumPage2(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

      public void firstlink1() {
	firstlink.click();
}



}