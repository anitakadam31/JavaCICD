package CICD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitCICD {

	@Test
	void test() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(10,a.add(5, 5));
	}

	void test1() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(10,a.add(5, 5));
	}
}
