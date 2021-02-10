package Com.Jenkins;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Samples {
	
	
	@BeforeSuite
	private void TestSarted() {
		// TODO Auto-generated method stub
		System.out.println("Test started");
	}
	
	@AfterSuite
	private void TestEnded() {
		// TODO Auto-generated method stub
		System.out.println("testended");
	}
	@BeforeTest
	private void BrowserOpen() {
		// TODO Auto-generated method stub
		System.out.println("Browseropen");
	}
	@AfterTest
	private void BrowserClose() {
		// TODO Auto-generated method stub
		System.out.println("browserclose");
	}
	
	@BeforeClass
	private void MaxWin() {
		// TODO Auto-generated method stub
		System.out.println("max win");
	}
	
	@AfterClass
	private void minwin() {
		// TODO Auto-generated method stub
		System.out.println("min win");
	}
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("Test 1 passed");
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("Test 2 passed");
	}
	@Test
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("Test 3 passed");
	}
	@Test
	private void tc4() {
		// TODO Auto-generated method s
		System.out.println("Test 4 passed");
	}

}
