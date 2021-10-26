package org.day1class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class Flipkart {
	
	
	 public static void main(String[] args) throws InterruptedException {  
	      
         // System Property for Chrome Driver   
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJA\\Downloads\\chromedriver.exe");  
        
           // Instantiate a ChromeDriver class.     
      WebDriver driver=new ChromeDriver();  
        
         // Launch Website  
      driver.navigate().to("http://www.Flipkart.com/");  
        
       //Maximize the browser  
        driver.manage().window().maximize();  
        Thread.sleep(3000);
        driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
        
	 }
}
