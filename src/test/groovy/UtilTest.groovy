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
}
