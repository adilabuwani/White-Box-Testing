package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC2 {

BuggyClass myBuggyClass;
	
	@Before
	public void setUp() {
	myBuggyClass= new BuggyClass();
	}
	
	@After            //after each test
    public void tearDown() {
        myBuggyClass = null;
    }
	
// these test achieves 100% statement coverage of BuggyMethod2 and not reveal the fault therein	
	@Test 
	public void testBuggyClassMethod2a1() {
	assertEquals(16, myBuggyClass.buggyMethod2(3, 4));
	}
	
	@Test 
	public void testBuggyClassMethod2a2() {
	assertEquals(0, myBuggyClass.buggyMethod2(20, 6));
	}

}
