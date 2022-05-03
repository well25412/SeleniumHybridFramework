package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilies;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException, InterruptedException{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
	SkillraryDemoApp sd = new SkillraryDemoApp(driver);
	driverUtilies.switchingTabs(driver);
	driverUtilies.dropDown(sd.getAddressdropdown(),pdata.getPropertyfiledata("dropdowndata"));
		TestingPage t = new TestingPage(driver);
	driverUtilies.dragDrop(driver,t.getSeleniumtaring(),t.getCart());
	Thread.sleep(3000);
	Point loc =t.getCart().getLocation();
	int x =loc.getX();
	int y =loc.getY();
	driverUtilies.scrollBar(driver,x,y);
	driverUtilies.dragDrop(driver,t.getSeleniumtaring(),t.getCart());
	
        t.facebookicon();
	}
	
	
		
		
	}


