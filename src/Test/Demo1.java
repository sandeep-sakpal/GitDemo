package Test;

import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@AfterClass
	public void After() {
		System.out.println("After class method is run");
	}
	
	@BeforeMethod
	public void bf()
	{
		System.out.println("print Before method");
	}

	@BeforeSuite(timeOut=4000)
    public void bfsute()
    {
		System.out.println("i am first");
    }
	 
	@Parameters({"url"})
	
	@Test()
	public void loan(String username) {
		System.out.println("hello world");
		System.out.println(username);
	}
	
	@BeforeTest()
	public void BT()
	{
		System.out.println("Before test");
	}
	
	
	@AfterTest()
	public void hihihi()
	{
		System.out.println("After test");
	}

	@BeforeClass
	public void before() {
		System.out.println("before class method is run");
	}

	@AfterSuite
	public void Afsute()
	{
		System.out.println("After sute method is print");
	}
	
	@AfterMethod
	public void afmeth()
	{
		System.out.println("Ater method");
	}
	
	
}



