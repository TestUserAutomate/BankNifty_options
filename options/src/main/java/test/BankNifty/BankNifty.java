package test.BankNifty;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankNifty {
	 static final String DB_URL = "jdbc:mysql://localhost:3306/banknifty";
	   static final String USER = "root";
	   static final String PASS = "root";
	  
	public static void main(String[] args) throws InterruptedException, SQLException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nithin\\workspace\\BankNifty\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		String Curr_time=null;
        String baseUrl = "https://groww.in/indices/nifty-bank";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
        	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        	 PreparedStatement stmt=conn.prepareStatement("insert into banknifty_values values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  

	
        Thread.sleep(5000);
      
        for(int i =0;i<700;i++){
        	
        	DateFormat dfor = new SimpleDateFormat("dd-MM HH:mm");
        	Date obj = new Date();
        	Curr_time = dfor.format(obj);
        	System.out.println(Curr_time);
        	  driver.findElement(By.xpath("//*[text()='Option Chain']")).click();
              Thread.sleep(4000); 
        driver.findElement(By.xpath("//*[@class='se55Input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='se55DropdownPara '])[2]")).click();
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        String sptPrice=driver.findElement(By.xpath("//*[@class='optc56SpotPriceText']")).getText();
        sptPrice =sptPrice.substring(12,19);
        float spotprice = Float.parseFloat(sptPrice);
        
        			
  
        // Put values
        
        String Pe_35000 =driver.findElement(By.xpath("//*[text()='35,000.00']//following::td[1]")).getText();
        String Pe_35000_val =Pe_35000.substring(1,7);
        float Pe_35000_flt = Float.parseFloat(Pe_35000_val);
		String Pe_35000_Points=Pe_35000.substring(8,14);
        
        String Pe_35200 =driver.findElement(By.xpath("//*[text()='35,200.00']//following::td[1]")).getText();
        String Pe_35200_val =Pe_35200.substring(1,7);
        float Pe_35200_flt = Float.parseFloat(Pe_35200_val);
        String Pe_35200_Points=Pe_35200.substring(8,14);
        
        String Pe_35400 =driver.findElement(By.xpath("//*[text()='35,400.00']//following::td[1]")).getText();
        String Pe_35400_val =Pe_35400.substring(1,8);
        float Pe_35400_flt = Float.parseFloat(Pe_35400_val);
        String Pe_35400_Points=Pe_35400.substring(8,14);
        
        String Pe_35600 =driver.findElement(By.xpath("//*[text()='35,600.00']//following::td[1]")).getText();
        String Pe_35600_val =Pe_35600.substring(1,8);
        float Pe_35600_flt = Float.parseFloat(Pe_35600_val);
        String Pe_35600_Points=Pe_35600.substring(8,14);
        
        
        String Pe_35800 =driver.findElement(By.xpath("//*[text()='35,800.00']//following::td[1]")).getText();
        String Pe_35800_val =Pe_35800.substring(1,8);
        float Pe_35800_flt = Float.parseFloat(Pe_35800_val);
        String Pe_35800_Points=Pe_35800.substring(8,14);
        
        
        String Pe_36000 =driver.findElement(By.xpath("//*[text()='36,000.00']//following::td[1]")).getText();
        String Pe_36000_val =Pe_36000.substring(1,8);
        float Pe_36000_flt = Float.parseFloat(Pe_36000_val);

        String Pe_36000_Points=Pe_36000.substring(8,14);
        
        
        String Pe_36200 =driver.findElement(By.xpath("//*[text()='36,200.00']//following::td[1]")).getText();
        String Pe_36200_val =Pe_36200.substring(1,8);
        float Pe_36200_flt = Float.parseFloat(Pe_36200_val);
        String Pe_36200_Points=Pe_36200.substring(8,14);
        
        
        String Pe_36400 =driver.findElement(By.xpath("//*[text()='36,400.00']//following::td[1]")).getText();
        String Pe_36400_val =Pe_36400.substring(1,8);
        float Pe_36400_flt = Float.parseFloat(Pe_36400_val);
        String Pe_36400_Points=Pe_36400.substring(8,14);
       
        
        String Pe_36600 =driver.findElement(By.xpath("//*[text()='36,600.00']//following::td[1]")).getText();
        String Pe_36600_val =Pe_36600.substring(1,7);
        float Pe_36600_flt = Float.parseFloat(Pe_36600_val);

        String Pe_36600_Points=Pe_36600.substring(8,14);
        
        String Pe_36800 =driver.findElement(By.xpath("//*[text()='36,800.00']//following::td[1]")).getText();
        String Pe_36800_val =Pe_36800.substring(1,7);
        float Pe_36800_flt = Float.parseFloat(Pe_36800_val);

        String Pe_36800_Points=Pe_36800.substring(8,14);
        
        String Pe_37000 =driver.findElement(By.xpath("//*[text()='37,000.00']//following::td[1]")).getText();
        String Pe_37000_val =Pe_37000.substring(1,7);
        float Pe_37000_flt = Float.parseFloat(Pe_37000_val);

        String Pe_37000_Points=Pe_37000.substring(8,14);
        
        String Pe_37200 =driver.findElement(By.xpath("//*[text()='37,200.00']//following::td[1]")).getText();
        String Pe_37200_val =Pe_37200.substring(1,7);
        float Pe_37200_flt = Float.parseFloat(Pe_37200_val);

        String Pe_37200_Points=Pe_37200.substring(8,14);
        
        
        
        
        //------------------------------------------------------------------------------//
        
        //---Calls Value
        
        String Ce_36600 =driver.findElement(By.xpath("//*[text()='36,600.00']//preceding::td[1]")).getText();
        String Ce_36600_val =Ce_36600.substring(1,7);
        float Ce_36600_flt = Float.parseFloat(Ce_36600_val);
        String Ce_36600_Points=Ce_36600.substring(8,14);
        
        String Ce_36800 =driver.findElement(By.xpath("//*[text()='36,800.00']//preceding::td[1]")).getText();
        String Ce_36800_val =Ce_36800.substring(1,7);
        
        float Ce_36800_flt = Float.parseFloat(Ce_36800_val);

        String Ce_36800_Points=Ce_36800.substring(8,14);
        

        String Ce_37000 =driver.findElement(By.xpath("//*[text()='37,000.00']//preceding::td[1]")).getText();
        String Ce_37000_val =Ce_37000.substring(1,7);
        float Ce_37000_flt = Float.parseFloat(Ce_37000_val);
        String Ce_37000_Points=Ce_37000.substring(8,14);
        
        String Ce_37200 =driver.findElement(By.xpath("//*[text()='37,200.00']//preceding::td[1]")).getText();
        String Ce_37200_val =Ce_37200.substring(1,7);
        float Ce_37200_flt = Float.parseFloat(Ce_37200_val);
        String Ce_37200_Points=Ce_37200.substring(8,14);
        
        String Ce_37400 =driver.findElement(By.xpath("//*[text()='37,400.00']//preceding::td[1]")).getText();
        String Ce_37400_val =Ce_37400.substring(1,7);
        float Ce_37400_flt = Float.parseFloat(Ce_37400_val);
        String Ce_37400_Points=Ce_37400.substring(8,14);
        
        
        String Ce_37600 =driver.findElement(By.xpath("//*[text()='37,600.00']//preceding::td[1]")).getText();
        String Ce_37600_val =Ce_37600.substring(1,7);
        float Ce_37600_flt = Float.parseFloat(Ce_37600_val);
        String Ce_37600_Points=Ce_37600.substring(8,14);
        
        
        String Ce_37800 =driver.findElement(By.xpath("//*[text()='37,800.00']//preceding::td[1]")).getText();
        String Ce_37800_val =Ce_37800.substring(1,7);
        float Ce_37800_flt = Float.parseFloat(Ce_37800_val);
        String Ce_37800_Points=Ce_37800.substring(8,14);
        
        String Ce_38000 =driver.findElement(By.xpath("//*[text()='38,000.00']//preceding::td[1]")).getText();
        String Ce_38000_val =Ce_38000.substring(1,7);
        float Ce_38000_flt = Float.parseFloat(Ce_38000_val);
        String Ce_38000_Points=Ce_38000.substring(8,14);
        
        String Ce_38400 =driver.findElement(By.xpath("//*[text()='38,200.00']//preceding::td[1]")).getText();
        String Ce_38400_val =Ce_38400.substring(1,7);
        float Ce_38400_flt = Float.parseFloat(Ce_38400_val);
        String Ce_38400_Points=Ce_38400.substring(8,14);
        
        String Ce_38200 =driver.findElement(By.xpath("//*[text()='38,400.00']//preceding::td[1]")).getText();
        String Ce_38200_val =Ce_38200.substring(1,7);
        float Ce_38200_flt = Float.parseFloat(Ce_38200_val);
        String Ce_38200_Points=Ce_38200.substring(8,14);
        
        String Ce_38600 =driver.findElement(By.xpath("//*[text()='38,600.00']//preceding::td[1]")).getText();
        String Ce_38600_val =Ce_38600.substring(1,7);
        float Ce_38600_flt = Float.parseFloat(Ce_38600_val);
        String Ce_38600_Points=Ce_38600.substring(8,14);
       
        
        
        
        
        
        
        
        
        
       

       
        

        System.out.println(sptPrice);
        System.out.println(Pe_35000_val);
        System.out.println(Pe_35200_val);
        System.out.println(Pe_35400_val);
        System.out.println(Pe_35600_val);
        System.out.println(Pe_35800_val);
        System.out.println(Pe_36000_val);
        System.out.println(Pe_36200_val);
        System.out.println(Pe_36400_val);
        System.out.println(Pe_36600_val);
        System.out.println(Pe_36800_val);
       System.out.println(Pe_37000_val);
        
        
        System.out.println("------------------Call values");
        
        System.out.println( Ce_37000_val);
        System.out.println( Ce_37200_val);
        System.out.println( Ce_37400_val);
        System.out.println( Ce_37600_val);
        System.out.println( Ce_37800_val);
        System.out.println( Ce_38000_val);
        System.out.println( Ce_38200_val);
        System.out.println( Ce_38400_val);
        System.out.println( Ce_38600_val);
        
        stmt.setNString(1,Curr_time);
        stmt.setDouble(2, spotprice);
        stmt.setFloat(3,Pe_35000_flt);
        stmt.setFloat(4,Pe_35200_flt);
        stmt.setFloat(5,Pe_35400_flt);
        stmt.setFloat(6,Pe_35600_flt);
        stmt.setFloat(7,Pe_35800_flt);
        stmt.setFloat(8,Pe_36000_flt);
        stmt.setFloat(9,Pe_36200_flt);
        stmt.setFloat(10,Pe_36400_flt);
        stmt.setFloat(11,Pe_36600_flt);
        stmt.setFloat(12,Pe_36800_flt);
       stmt.setFloat(13,Pe_37000_flt);
        stmt.setFloat(14,Pe_37200_flt);
        stmt.setFloat(15, Ce_36600_flt);
        stmt.setFloat(16, Ce_36800_flt);

        stmt.setFloat(17, Ce_37000_flt);

        stmt.setFloat(18, Ce_37200_flt);
        stmt.setFloat(19, Ce_37400_flt);
        stmt.setFloat(20, Ce_37600_flt);

        stmt.setFloat(21, Ce_37800_flt);
        stmt.setFloat(22, Ce_38000_flt);
        stmt.setFloat(24, Ce_38200_flt);
        stmt.setFloat(23, Ce_38400_flt);
        stmt.setFloat(25, Ce_38600_flt);
     
   
        stmt.executeUpdate();  
        System.out.println(i+" records inserted");  
        
        
        Thread.sleep(60000);
        	driver.navigate().refresh();
        }
        	
        	
        	
       
	}

}
