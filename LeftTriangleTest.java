import static org.junit.Assert.*;

import org.junit.Test;

public class LeftTriangleTest {

	@Test
	public void testInit()
	{
		LeftTriangle ltri = new LeftTriangle();
		assertEquals('\0', ltri.getAppearance());
		assertEquals(0, ltri.getHeight());
		assertEquals(0, ltri.getWidth());
	}
	

	@Test //test appearance setters and getters
	public void testAppearance()
	{
		LeftTriangle ltri = new LeftTriangle();
		ltri.setAppearance('3');	//test number appearance
		assertEquals('3', ltri.getAppearance());
		
		ltri.setAppearance('z');	//test letter appearance
		assertEquals('z', ltri.getAppearance());
		
		ltri.setAppearance('#');	//test symbol appearance
		assertEquals('#', ltri.getAppearance());
		
		ltri.setAppearance('"');	//test code appearance
		assertEquals('"', ltri.getAppearance());
		
		ltri.setAppearance('=');	//test symbols that could be in code
		assertEquals('=', ltri.getAppearance());
		
		//test if the input from a string is parsed corltrily
		String str = "RE$45";	//LeftTriangle symbol $
		ltri.setAppearance(str.charAt(2));
		assertEquals('$', ltri.getAppearance());
		
		str = "RT35"; //3
		ltri.setAppearance(str.charAt(2));
		assertEquals('3', ltri.getAppearance());
		
		str = "LTH1"; //H
		ltri.setAppearance(str.charAt(2));
		assertEquals('H', ltri.getAppearance());
	}
	
	@Test
	public void testHeight()
	{
		LeftTriangle ltri = new LeftTriangle();
		
		ltri.setHeight(6);		//normal number
		assertEquals(6, ltri.getHeight());
		
		ltri.setHeight(6000);		//real big number
		assertEquals(6000, ltri.getHeight());
		
		ltri.setHeight(-6000);		//real small number
		assertEquals(-6000, ltri.getHeight());
		
		//test string parsing
		String str = "RE$45";
		ltri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(4, ltri.getHeight());
		
		str = "RT35"; //3
		ltri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(5, ltri.getHeight());
		
		str = "LTH1";
		ltri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, ltri.getHeight());
		
		str = "LTH15";	//make sure that height is single digits only
		ltri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, ltri.getHeight());
	}

	@Test
	public void testWidth()
	{
		LeftTriangle ltri = new LeftTriangle();
		
		ltri.setWidth(5);	//test normal number
		assertEquals(5, ltri.getWidth());
		
		ltri.setWidth(5000);	//test big number
		assertEquals(5000, ltri.getWidth());
		
		ltri.setWidth(-5000);	//test small number
		assertEquals(-5000, ltri.getWidth());
		
	}
}
