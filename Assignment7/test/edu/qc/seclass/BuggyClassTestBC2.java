package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestBC2 {

BuggyClass myBuggyClass;
	
	@Before
	public void setUp() {
	myBuggyClass= new BuggyClass();
	}
	
	@After            //after each test
    public void tearDown() {
        myBuggyClass = null;
    }
	
//these test achieves more then 50% branch coverage of buggyMethod2 and revel the fault therein	
	@Test 
	public void testBuggyClassMethod2b1() {
	assertEquals(16, myBuggyClass.buggyMethod2(3, 4));
	}
	
	@Test 
	public void testBuggyClassMethod2b2() {
	assertEquals(11, myBuggyClass.buggyMethod2(5, 5));
	}
	@Test 
	public void testBuggyClassMethod2b3() {
	assertEquals(11, myBuggyClass.buggyMethod2(10, 5));
	}
} //end BuggyClassTestBC2
