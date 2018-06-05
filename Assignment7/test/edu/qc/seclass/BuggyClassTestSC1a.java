package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC1a {
	BuggyClass myBuggyClass;
	
	@Before
	public void setUp() {
	myBuggyClass= new BuggyClass();
	}
	
	@After            //after each test
    public void tearDown() {
        myBuggyClass = null;
    }
	
	//these two test achieves a 100% statement coverage of buggyMethod1 and does not revel the fault therein
	@Test
	public void testBuggyClassMethod1a1() {
	assertEquals(1, myBuggyClass.buggyMethod1(1, 1));
	}
	
	@Test
	public void testBuggyClassMethod1a2() {
	assertEquals(6, myBuggyClass.buggyMethod1(8, 7));
	}

}
