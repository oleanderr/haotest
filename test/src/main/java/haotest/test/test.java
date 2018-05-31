package haotest.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {

	@BeforeClass
	public void setup() {
		
	}
	@Test(groups = {"fast"})
	public void afast() {
		System.out.println("FAST fast");
	}

}
