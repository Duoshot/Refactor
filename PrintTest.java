import static org.junit.Assert.*;

import org.junit.Test;

public class PrintTest {

	@Test	//test initial
	public void testInit() 
	{
		Print print = new Print();
		
		assertEquals(0, print.getNumLeftTri());
		assertEquals(0, print.getNumRec());
		assertEquals(0, print.getNumRightTri());
	}
	
	@Test
	public void testRec()
	{
		Print print = new Print();
	
		print.addNumRec();
		assertEquals(1, print.getNumRec());
		
		print.addNumRec();
		assertEquals(2, print.getNumRec());
		
		print.addNumRec();
		assertEquals(3, print.getNumRec());
		
		print.addNumRec();
		assertEquals(4, print.getNumRec());
		
		print.addNumRec();
		assertEquals(5, print.getNumRec());
	}
	
	@Test
	public void testRightTri()
	{
		Print print = new Print();
		
		print.addNumRightTri();
		assertEquals(1, print.getNumRightTri());
		
		print.addNumRightTri();
		assertEquals(2, print.getNumRightTri());
		
		print.addNumRightTri();
		assertEquals(3, print.getNumRightTri());
		
		print.addNumRightTri();
		assertEquals(4, print.getNumRightTri());
		
		print.addNumRightTri();
		assertEquals(5, print.getNumRightTri());
	}
	
	@Test
	public void testLeftTri()
	{
		Print print = new Print();
		
		print.addNumLeftTri();
		assertEquals(1, print.getNumLeftTri());
		
		print.addNumLeftTri();
		assertEquals(2, print.getNumLeftTri());
		
		print.addNumLeftTri();
		assertEquals(3, print.getNumLeftTri());
		
		print.addNumLeftTri();
		assertEquals(4, print.getNumLeftTri());
		
		print.addNumLeftTri();
		assertEquals(5, print.getNumLeftTri());
	}
}
