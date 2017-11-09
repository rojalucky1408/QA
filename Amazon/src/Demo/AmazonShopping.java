package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonShopping {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravul\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/register%3Fopenid.assoc_handle%3Dsmallparts_amazon%26openid.identity%3Dhttp%253A%252F%252Fspecs.openid.net%252Fauth%252F2.0%252Fidentifier_select%26openid.ns%3Dhttp%253A%252F%252Fspecs.openid.net%252Fauth%252F2.0%26openid.claimed_id%3Dhttp%253A%252F%252Fspecs.openid.net%252Fauth%252F2.0%252Fidentifier_select%26openid.return_to%3Dhttps%253A%252F%252Fwww.smallparts.com%252Fsignin%26marketPlaceId%3DA2YBZOQLHY23UT%26clientContext%3D187-1331220-8510307%26pageId%3Dauthportal_register%26openid.mode%3Dcheckid_setup%26siteState%3DfinalReturnToUrl%253Dhttps%25253A%25252F%25252Fwww.smallparts.com%25252Fcontactus%25252F187-1331220-8510307%25253FappAction%25253DContactUsLanding%252526pf_rd_m%25253DA2LPUKX2E7NPQV%252526appActionToken%25253DlptkeUQfbhoOU3v4ShyMQLid53Yj3D%252526ie%25253DUTF8%252Cregist%253Dtrue");
			driver.findElement(By.id("ap_customer_name")).sendKeys("roja");
			driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("rojalucky1408@gmail.com");
			driver.findElement(By.cssSelector("#ap_email_check")).sendKeys("rojalucky1408@gmail.com");
			driver.findElement(By.cssSelector("#ap_password")).sendKeys("Rojalucky@1408");
			driver.findElement(By.xpath(".//*[@id='ap_password_check']")).sendKeys("Rojalucky@1408");
			driver.findElement(By.xpath(".//*[@id='continue']")).click();
			
		for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	    Thread.sleep(1000);
	   
	    driver.get("https://www.amazon.com/");
	    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone7");
	    driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).click();
	    driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("rojalucky1408@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='continue']")).click();
	    driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Rojalucky@1408");
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    Thread.sleep(500);
	    
	    
	    driver.close();
	   
		}
}
}


