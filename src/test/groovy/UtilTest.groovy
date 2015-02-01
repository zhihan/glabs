package me.zhihan.glabs

import org.junit.Test
import org.junit.Assert

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

class UtilTest {
	@Test
	void testFirst() {
		Assert.assertEquals(Util.hello("world"), "Hello, world")
	}

	@Test
	void testSecond() {
		assertThat(Util.hello("world"), equalTo("Hello, world"))
	}

	@Test
	void testFindAll() {
		// 'findAll' is the filter function for groovy collections
		def x = [1, 2, 3]
		def y = x.findAll{it > 1}
		assertThat(y.size, equalTo(2))
	}
}
