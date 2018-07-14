package testngexample;

import org.testng.annotations.Test;

public class TestDepend {
	
		@Test
		public void mango(){
			System.out.println("MANGO");
		}
		@Test(dependsOnMethods="mango")
		public void orange(){
			System.out.println("ORANGE");
		}
		@Test(dependsOnMethods="orange")
		public void apple(){
			System.out.println("APPLE");
		}

}
