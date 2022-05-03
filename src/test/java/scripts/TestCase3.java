package scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.JavaForSeleniumPage;
import pomPages.LearnCoreJava;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
		         @Test
	
	public void tc1() throws InterruptedException, IOException {

		        	 SkillraryLoginPage s= new SkillraryLoginPage(driver);      	 
		       		 s.searchtext(pdata.getPropertyfiledata("searchvalue"));
		     	  s.searchbutton();
		        	 
		JavaForSeleniumPage j = new JavaForSeleniumPage(driver);
			       j.firstlink1();
    	            j.popup();
	    driverUtilies.switchFrames(driver);
	      j.playicon();
	      Thread.sleep(10000);
	     j.pauseicon();
	    driverUtilies.switchBackFrames(driver);
          j.AddWish();
	    Thread.sleep(9000);
	    String title = "Sorry!Please login first   error";
 	
	   Assert.assertEquals("Sorry!Please login first   error",title);
//	   Assert.assertEquals(driver.getTitle(), "fsfasfasf");
	   
	    
	   
	    
	    
	    
	
	

}}
