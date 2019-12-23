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
			
		String path = System.getProperty("user.dir");   // return project folder path

		String driverpath = path + "\\WEBDRIVER\\chromedriver.exe";   // return driver folder path 

		System.setProperty("webdriver.chrome.driver",driverpath );
		//System.setProperty("Webdriver.chrome.driver","E:\\Selinium\\DRIVERS\\chromedriver.exe");
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
        
    	//Vehicletype
    	 Boolean dropdownPresent = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")).isEnabled();
    	 
    	 if(dropdownPresent==true)
         {
    	
        Select Vehicletype = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
Vehicletype.selectByValue("20305");
System.out.println("Dropdown is Enabled");
         }
    	 
    		 else{
    	            System.out.println("Dropdown is Disabled");
    	        }

//PickUp Date
WebElement PickDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input"));

if(PickDate.isEnabled())
{
PickDate.clear();
PickDate.sendKeys("01-January-2020");
System.out.println("Pick Date is enabled ");
}
else
{
	System.out.println("Pick Date is disabled ");	
}

//PickUp Time
Select PickupTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[2]/select")));
PickupTime.selectByValue("23");


//Drop OFf Date
WebElement DropDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input"));

if(DropDate.isEnabled())
{
DropDate.clear();
DropDate.sendKeys(" 03-January-2020");
System.out.println("DropDate is enabled ");
}
    
else
{
	System.out.println("DropDate is disabled ");	
}
//DropOff Time

Select DropTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[2]/select")));
DropTime.selectByValue("25");




//PickUp Location Selection
Select PickLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")));
PickLocation.selectByValue("28592");

//Different Drop Off Location Check Box
if ( !driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[5]/div/input")).isSelected());
{
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[5]/div/input")).click();
}


//Drop Off Location
Select DropLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[2]/select")));
DropLocation.selectByValue("28593");

//Search 

WebElement Element2=driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[7]/div[2]/button/translate/span"));

if( Element2.isEnabled())
{
	Element2.click();
}
else
{	
System.out.println("Search button disable");
}



//Radio Selection
new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(@class,'css-label radGroup1')])[3]"))).click();


String URR3="http://67.43.12.211/NavotarReservation//Wizard#/step1";
String CurrentUR2= driver.getCurrentUrl();


if(CurrentUR2.equals(URR3))
{
	System.out.println("MVP chekc box page URL is Match");
	}
else

{
	driver.close();
}



//Next Button


WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[6]/div[4]/div[2]/ul/li/button"));
if( element.isEnabled())
{
	element.click();
}else
{	
System.out.println("Next button disable");
}
driver.quit();
Thread.sleep(5000);
}
    
 
    		
    public static void  TestScenar2() throws InterruptedException {
    	
    	System.out.println("TestScenar2");	
    	Thread.sleep(5000);
    	
    	
    	
    	 
    	//Vehicletype
    	 Boolean dropdownPresent2 = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")).isEnabled();
    	 
    	 if(dropdownPresent2==true)
         {
    	
        Select Vehicletype = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));
Vehicletype.selectByValue("20305");
System.out.println("Dropdown is Enabled");
         }
    	 
    		 else{
    	            System.out.println("Dropdown is Disabled");
    	        }
    	 //PickUp Date         	 
    	 WebElement PickDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input"));
    	 if(PickDate.isEnabled())
    	 {
    	 PickDate.clear();
    	 PickDate.sendKeys("01-January-2020");
    	 System.out.println("Pick Date is enabled ");
    	 }
    	 else
    	 {
    	 	System.out.println("Pick Date is disabled ");	
    	 }
    	

    	 //PickUp Time
    	 Select PickupTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[2]/select")));
    	 PickupTime.selectByValue("42");
           
    	
    	 //Drop OFf Date
    	 WebElement DropDate = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input"));

if(DropDate.isEnabled())
{
DropDate.clear();
DropDate.sendKeys(" 03-January-2020");
System.out.println("DropDate is enabled ");
}
    
else
{
	System.out.println("DropDate is disabled ");	
}
    	

    	 //DropOff Time

    	 Select DropTime = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[2]/select")));
    	 DropTime.selectByValue("42");
   
    	 //PickUp Location Selection
    	 Select PickLocation = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")));
    	 PickLocation.selectByValue("28592");
    
    	 
    	//Different Drop Off Location Check Box
    	 if ( driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[5]/div/input")).isSelected());
    	 {
    	 	Thread.sleep(1000);
    	 
    	 	System.out.println("Different Drop Off  Check BoxUnchecked ");
    	 }

    	 ////search Button
    	 WebElement Element2=driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[7]/div[2]/button/translate/span"));

    	 if( Element2.isEnabled())
    	 {
    	 	Element2.click();
    	 }
    	 else
    	 {	
    	 System.out.println("Search button disable");
    	 }
    	 
    	 driver.quit();
    	 Thread.sleep(5000);
    }
    	  	
    	 

}
