package DriftCoffeeKitchen_Website;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Drift_Coffee 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Launch browser
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sai\\Desktop\\Selenium jar\\geckodriver.exe");
	    WebDriver w=new FirefoxDriver();
				
		//Open URL
	   
	    w.get("https://driftcoffee.kitchen");
	    Thread.sleep(2000);
	    
	    //getCurrentUrl 
	    
	    System.out.println("Current URL is: " + w.getCurrentUrl());
	     
	    //getTitle
	    
	    System.out.println("Title of page is: " + w.getTitle());
	    
	    //Login
	    
	    w.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    
	    System.out.println("Current URL of Login Page: " + w.getCurrentUrl());
	    
	    System.out.println("Title of Login Page: " + w.getTitle());
	    
	    //Create Account
	    
	    w.findElement(By.linkText("Create account")).click();
	    w.findElement(By.id("first_name")).sendKeys("Shivangi");
	    w.findElement(By.id("last_name")).sendKeys("Tribhuvan");
	    w.findElement(By.id("email")).sendKeys("shiv@gmail.com");
	    w.findElement(By.id("password")).sendKeys("shivangi12");
	    
	    w.findElement(By.xpath("//*[@id=\"create_customer\"]/div[5]/input")).click(); 
	    
        TakesScreenshot t=(TakesScreenshot) w;
		
		File src=t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("D:\\Screenshot\\Recaptcha.png"));

	    
	    w.navigate().to("https://driftcoffee.kitchen");
	    
	   //Login to Account
	    
	    w.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    
	    w.findElement(By.id("customer_email")).sendKeys("shiv@gmail.com");
	    w.findElement(By.id("customer_password")).sendKeys("shivangi12");
	    w.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/p/input")).click(); 
	    
	    System.out.println("Login Successfully Done");
	    
	    //Return to store
	    
	    w.findElement(By.linkText("Return to Store")).click();
	    
	    //Your Account
	    
	    w.findElement(By.linkText("Your Account")).click();
		    
	    //View Addresses
	    
	    w.findElement(By.xpath("//*[@id=\"view_address\"]")).click();
	    
	    w.findElement(By.linkText("Add a New Address")).click();
	    w.findElement(By.name("address[first_name]")).sendKeys("Shivangi");
	    w.findElement(By.name("address[last_name]")).sendKeys("Tribhuvan");
	    w.findElement(By.name("address[company]")).sendKeys("TCS");
	    w.findElement(By.name("address[address1]")).sendKeys("Niwara Nagari");
	    w.findElement(By.name("address[address2]")).sendKeys("Niwara Nagari");
	    w.findElement(By.name("address[city]")).sendKeys("Pune");
	    
	    Select s=new Select(w.findElement(By.name("address[country]")));
	    s.selectByIndex(1);
	    
	    w.findElement(By.name("address[zip]")).sendKeys("411000");
	    w.findElement(By.name("address[phone]")).sendKeys("8888888888");
	    w.findElement(By.name("address[default]")).click();
	    w.findElement(By.xpath("//*[@id=\"address_form_new\"]/div/p/input")).click();
	    Thread.sleep(2000);
	    
	    //Return to Account Details
	    
	    w.findElement(By.linkText("Return to Account Details")).click();
	    
	    w.findElement(By.xpath("//*[@id=\"view_address\"]")).click();
	   
	    //Add a New Address
	    
	    w.findElement(By.linkText("Add a New Address")).click();  
	    
	    w.findElement(By.xpath("//*[@id=\"address_form_new\"]/div/p/input")).click();
	    Thread.sleep(2000); 
	    
	    
        //Return to Account Details
	    
	    w.findElement(By.linkText("Return to Account Details")).click();
	    
	    //Logout
	    
	    w.findElement(By.linkText("Log out")).click();
	    System.out.println("Logout Successfully Done");
	    
	    
	    //More
		  
		 w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		  
		  //Catering
		  
		 w.findElement(By.linkText("Catering")).click();
		  
		  //getCurrentUrl 
		    
		   System.out.println("Current URL is: " + w.getCurrentUrl());
		  
		  //get Title
		  
		  System.out.println("Title of page is: " + w.getTitle());
		  
		  JavascriptExecutor js=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js.executeScript("window.scrollBy(0,500)", "");
		  
		  //View Map Mayfaire
		  
		  w.findElement(By.linkText("View Map")).click();
		  Thread.sleep(2000);
		  
         //get Title
		  
		  System.out.println("Title of page is: " + w.getTitle());
		  
		  //Search 
		  
		  w.findElement(By.id("searchbox-searchbutton")).click();  
		  Thread.sleep(2000);
	 
		  w.navigate().to("https://driftcoffee.kitchen");
		  
		  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		  
		  //View Map Autumn Hall
		  
		  w.findElement(By.linkText("Catering")).click();
		  
		  JavascriptExecutor js1=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js1.executeScript("window.scrollBy(0,600)", "");
		  
		  w.findElement(By.xpath("//*[@id=\"template\"]/div/section/div[3]/a")).click();
		  Thread.sleep(2000);
		   
		  Set<String> windows=w.getWindowHandles();
			
			Iterator<String> it=windows.iterator();
			
			String parent_window=it.next();
			
			String child_window1=it.next();
			
			w.switchTo().window(parent_window);
			Thread.sleep(2000);
			
			w.switchTo().window(child_window1);
			Thread.sleep(2000);
			
			w.switchTo().window(parent_window);
			Thread.sleep(2000);
		   
			  
		  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		  
		 
		  //Blog
		  
		 w.findElement(By.linkText("Blog")).click();
		 
		 //Autumn Hall
		 
		 w.findElement(By.linkText("Autumn Hall")).click();
		 
		  JavascriptExecutor js2=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js2.executeScript("window.scrollBy(0,600)", "");
		  
		  w.findElement(By.xpath("//span[contains(text(),'Read more')]")).click();
		  
		  JavascriptExecutor js3=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js3.executeScript("window.scrollBy(0,900)", "");
		  
		  w.findElement(By.xpath("//*[@id=\"shopify-section-article-template\"]/div[2]/div/div[1]/div/div[1]/div[2]/a")).click();
		  
		  JavascriptExecutor js4=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js4.executeScript("window.scrollBy(0,900)", "");
		  
		  w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/h3")).click();
		  
		  JavascriptExecutor js5=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js5.executeScript("window.scrollBy(0,900)", "");
		  
		w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/h3")).click();
		
        w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[3]/h3")).click();
		 
        //Coffee
        
        w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/coffee");
		  
        JavascriptExecutor js6=(JavascriptExecutor)w;
		Thread.sleep(2000);
		  
		  js6.executeScript("window.scrollBy(0,600)", "");
		  
		  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/a/span")).click();
		  
		  JavascriptExecutor js7=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js7.executeScript("window.scrollBy(0,600)", "");
		  
		  //Giveback
		  
		  w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/giveback");
		  
		  JavascriptExecutor js8=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js8.executeScript("window.scrollBy(0,900)", "");
		  
		  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[3]/div[1]/div[1]/div/div/div[2]/div/a/span")).click();
		  
		  //Menu
		  
		  w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/menu");
		  
		 
		  //News and Update
		  
		  w.findElement(By.linkText("News and Updates")).click();
		  
		  //Order Ahead App
		  
		  w.findElement(By.linkText("Order Ahead App")).click();
		  
		  //Wilmington
		  
		  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[2]/ul/li[7]/a")).click();
		  
		  
		  //F.A.Q
		  
		  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		  w.findElement(By.xpath("//*[@id=\"menu-tier-2\"]/ul/li[3]/a")).click();
		  
		  JavascriptExecutor js9=(JavascriptExecutor)w;
		  Thread.sleep(2000);
		  
		  js9.executeScript("window.scrollBy(0,900)", "");
		  
		  w.findElement(By.linkText("Ceremony Coffee Roasters")).click();
		  Thread.sleep(3000);
		  
		  Set<String> windows2=w.getWindowHandles();
			
			Iterator<String> it1=windows2.iterator();
			
			String parent_window1=it1.next();
			
			String child_window2=it1.next();
			
			w.switchTo().window(parent_window1);
			Thread.sleep(2000);
			
			w.switchTo().window(child_window2);
			Thread.sleep(2000);
			
			w.switchTo().window(parent_window1);
			Thread.sleep(2000);
			 
			
		  //About
		  
		  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		  
		  w.findElement(By.linkText("About")).click();
		 
		  //Contact
		  
		  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
		 
		  w.findElement(By.linkText("Contact")).click(); 
		  
		 
		  w.navigate().back();
		  
		  System.out.println("End of Page");
		  
		  w.quit();
		  
    
	}

}
