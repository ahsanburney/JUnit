package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions() {
	assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2(){
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
			assertFalse( 
					helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		}

		@Test
		public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
			assertTrue( 
					helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		}
}
