package test.BankNifty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   String Ce_38600 ="-85.6";
           String Ce_38600_val =Ce_38600.replaceAll("[^0-9.]", ""); 
           float Ce_38600_flt = Float.parseFloat(Ce_38600_val);
           System.out.println(Ce_38600_flt);
    }
}

