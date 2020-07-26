package com.epam.TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveA {
	
	/*TODO LIST
	 * 1. "" = ""  - SUCCESS
	 * 2. A = ""   - SUCCESS
	 * 3. B = B  - SUCCESS
	 * 4. AA = "" , AB = B ,BA = B , BB = BB  - SUCCESS
	 * 5. AABC = BC,ABA = BA BAD = BD , HOME = HOME  - SUCCESS
	 */
	RemoveCharA str;
	@BeforeEach
	void initialization()
	{
		str = new RemoveCharA(); 
	}

	@Test
	void testNull() {
		assertEquals("",str.remove(""));
	}
	@Test
	void testChar() {
		assertEquals("",str.remove("A"));
		assertEquals("B",str.remove("B"));
	}
	@Test
	void testTwo() {
		assertEquals("",str.remove("AA"));
		assertEquals("B",str.remove("AB"));
		assertEquals("B",str.remove("BA"));
		assertEquals("BB",str.remove("BB"));
	}
	@Test
	void testN() {
		assertEquals("BC",str.remove("AABC"));
		assertEquals("BA",str.remove("ABA"));
		assertEquals("BD",str.remove("BAD"));
		assertEquals("HOME",str.remove("HOME"));
	}

}