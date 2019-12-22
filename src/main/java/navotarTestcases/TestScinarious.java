package navotarTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScinarious {

	static WebDriver  driver;
	
 	
    
	public static void   URL() throws InterruptedException {
			
		System.setProperty("Webdriver.chrome.driver","E:\\Selinium\\DRIVERS\\chromedriver.exe");
		 driver= new ChromeDriver();
		String baseUrl = "http://67.43.12.211/NavotarReservation/?clientid=321&mode=qa&AspxAutoDetectCookieSupport=1#/?lang=en%20%3Chttp:%2F%2F67.43.12.211%2FNavotarReservation%2F%3Fclientid&mode=qa&AspxAutoDetectCookieSupport=1#%2F%3Flang=en%3E";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        driver.get(baseUrl);
	        Thread.sleep(1000);
	        String CurrentURl= driver.getCurrentUrl();
	        if(CurrentURl.equals(baseUrl))
	        {
	        	System.out.println("match");
	        }
	        else
	       
	        {
	        	driver.close();
	        }
	        
	        
	    }
	
		
	
    public static void  TestScenar1() throws InterruptedException {
    	System.out.println("TestScenar1");
    	Thread.sleep(5000);
        
        Select Vehicletype = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
Vehicletype.selectByValue("20305");

//PickUp Date
WebElement PickDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input"));
PickDate.clear();
PickDate.sendKeys("01-January-2020");

//PickUp Time
Select PickupTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[2]/select")));
PickupTime.selectByValue("23");

//Drop OFf Date
WebElement DropDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input"));
DropDate.clear();
DropDate.sendKeys(" 03-January-2020");

//DropOff Time

Select DropTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[2]/select")));
DropTime.selectByValue("25");

//PickUp Location Selection
Select PickLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")));
PickLocation.selectByValue("28592");

//Different Drop Off Location Check Box
if ( !driver.findElement(By.name("test") ).isSelected() )
{
	Thread.sleep(1000);
 driver.findElement(By.name("test")).click();
}

//Drop Off Location
Select DropLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[2]/select")));
DropLocation.selectByValue("28593");

//Search 

driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[7]/div[2]/button/translate/span")).click();

//Radio Selection




new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(@class,'css-label radGroup1')])[3]"))).click();

//Next Button


WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[6]/div[4]/div[2]/ul/li/button"));
if( element.isEnabled())
{
	element.click();
}else
{	
System.out.println("Search button disable");
}
driver.quit();
Thread.sleep(5000);
}
    
 
    		
    public static void  TestScenar2() throws InterruptedException {
    	
    	System.out.println("TestScenar2");	
    	Thread.sleep(5000);
    	
    	 Select Vehicletype = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
    	 Vehicletype.selectByValue("20305");

    	 //PickUp Date
    	 
    	 WebElement PickDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input"));
    	 PickDate.clear();
    	 PickDate.sendKeys("01-January-2020");

    	 //PickUp Time
    	 Select PickupTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[2]/select")));
    	 PickupTime.selectByValue("42");

    	 //Drop OFf Date
    	 WebElement DropDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input"));
    	 DropDate.clear();
    	 DropDate.sendKeys(" 03-January-2020");

    	 //DropOff Time

    	 Select DropTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[2]/select")));
    	 DropTime.selectByValue("42");

    	 //PickUp Location Selection
    	 Select PickLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")));
    	 PickLocation.selectByValue("28592");
    	 
    	//Different Drop Off Location Check Box
    	 if ( driver.findElement(By.name("test") ).isSelected() )
    	 {
    	 	Thread.sleep(1000);
    	  driver.findElement(By.name("test")).click();
    	 }

    	 driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[7]/div[2]/button")).click();
    	  	
    	 System.out.println("end");
////    	 driver.close();
    }
}
