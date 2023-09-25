package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}
	@Test
	public void cubeTest(){
		double baseValue = 5.0;
		double expected = baseValue*baseValue*baseValue;
		testMe.setValue(5.0);
		double actual = testMe.cube();

		assertTrue(actual == expected);
	}

	@Test
        public void times_two(){
                double baseValue = 13.0;
                double expected = baseValue*2.0;
                testMe.setValue(13.0);
                double actual = testMe.times_two();

                assertTrue(actual == expected);
        }
	@Test
        public void times_ten(){
                double baseValue = 12.0;
                double expected = baseValue*10;
                testMe.setValue(12.0);
                double actual = testMe.times_ten();

                assertTrue(actual == expected);
        }
}
