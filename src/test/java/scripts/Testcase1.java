package scripts;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
public class Testcase1 extends BaseClass{
	
			@Test
		public void tc1() {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverUtilies.switchingTabs(driver);
		driverUtilies.mouseHove(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddToCart a=new AddToCart(driver);
		driverUtilies.doubleClick(driver,a.getAdd());
		a.addcart();


}}
