package com.lee;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {
	@Test
	public void testMax() {
		int max = new MaxNumber().max(5, 6);
		// if (max != 6) {
		// throw new RuntimeException();
		// } else {
		// System.out.println("max = " + max);
		// }
		
		// 或者使用断言
		Assert.assertSame(6, max); // (期望值,真实值)
		// 注意: assertSame 底层使用 == 来比较 6 和 max
		// 如果换成 String 
		// Assert.assertSame(new String("a"), "a"); 异常抛出
		// 引用对象应该使用
		Assert.assertEquals(new String("a"), "a");
		Assert.assertNotNull(new String());
		Assert.assertTrue(true);
		/*
		 * junit运行在方法名、类名、包名、工程名都可以测试、
		 * @Test方法不能使静态修饰的
		 */
	}
}
