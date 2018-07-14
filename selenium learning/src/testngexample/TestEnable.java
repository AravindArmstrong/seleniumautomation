package testngexample;

import org.testng.annotations.Test;

public class TestEnable {
	@Test
	public void mango(){
		System.out.println("MANGO");
	}
	@Test(enabled=false)
	public void orange(){
		System.out.println("ORANGE");
	}
	@Test
	public void apple(){
		System.out.println("APPLE");
	}
}
