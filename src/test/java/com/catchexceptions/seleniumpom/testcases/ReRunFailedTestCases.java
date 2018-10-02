package com.catchexceptions.seleniumpom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunFailedTestCases {

	@Test(retryAnalyzer = MyRetry.class)
	public void test2() {
		Assert.fail();
	}
}
