package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
	}

}

class DataServiceStub implements DataService {
	@Override
	public int[] retriveAllData() {
		return new int[] {24,6,15};
	}
	
}