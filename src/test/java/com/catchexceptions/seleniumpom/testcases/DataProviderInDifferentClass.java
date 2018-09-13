package com.catchexceptions.seleniumpom.testcases;

import org.testng.annotations.Test;
/*By default, the data provider will be looked for in the current test class or 
one of its base classes. If you want to put your data provider in a different class, 
it needs to be a static method or a class with a non-arg constructor, and you specify 
the class where it can be found in the dataProviderClass attribute:*/
public class DataProviderInDifferentClass {
	

		 
		public class MyTest {
		  @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
		  public void test(Integer n) {
			  
			  System.out.println(n);
		    // ...
		  }
		}


}
