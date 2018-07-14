package testngexample;

import org.testng.annotations.Test;

public class TestGroup {
	@Test(groups="mango")
	public void mango(){
		System.out.println("MANGO");
	}
	@Test(groups="mango")
	public void mango1(){
		System.out.println("MANGO");
	}
	
	@Test(groups="orange")
	public void orange(){
		System.out.println("ORANGE");
	}
	@Test(groups="orange")
	public void orange1(){
		System.out.println("ORANGE");
	}
	
	@Test(groups="apple")
	public void apple(){
		System.out.println("APPLE");
	}
	@Test(groups="apple")
	public void apple1(){
		System.out.println("APPLE");
	}


}
