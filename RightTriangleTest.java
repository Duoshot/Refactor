import static org.junit.Assert.*;

import org.junit.Test;

public class RightTriangleTest {

	@Test
	public void testInit()
	{
		RightTriangle rtri = new RightTriangle();
		assertEquals('\0', rtri.getAppearance());
		assertEquals(0, rtri.getHeight());
		assertEquals(0, rtri.getWidth());
	}
	

	@Test //test appearance setters and getters
	public void testAppearance()
	{
		RightTriangle rtri = new RightTriangle();
		rtri.setAppearance('3');	//test number appearance
		assertEquals('3', rtri.getAppearance());
		
		rtri.setAppearance('z');	//test letter appearance
		assertEquals('z', rtri.getAppearance());
		
		rtri.setAppearance('#');	//test symbol appearance
		assertEquals('#', rtri.getAppearance());
		
		rtri.setAppearance('"');	//test code appearance
		assertEquals('"', rtri.getAppearance());
		
		rtri.setAppearance('=');	//test symbols that could be in code
		assertEquals('=', rtri.getAppearance());
		
		//test if the input from a string is parsed corrtrily
		String str = "RE$45";	//RightTriangle symbol $
		rtri.setAppearance(str.charAt(2));
		assertEquals('$', rtri.getAppearance());
		
		str = "RT35"; //3
		rtri.setAppearance(str.charAt(2));
		assertEquals('3', rtri.getAppearance());
		
		str = "LTH1"; //H
		rtri.setAppearance(str.charAt(2));
		assertEquals('H', rtri.getAppearance());
	}
	
	@Test
	public void testHeight()
	{
		RightTriangle rtri = new RightTriangle();
		
		rtri.setHeight(6);		//normal number
		assertEquals(6, rtri.getHeight());
		
		rtri.setHeight(6000);		//real big number
		assertEquals(6000, rtri.getHeight());
		
		rtri.setHeight(-6000);		//real small number
		assertEquals(-6000, rtri.getHeight());
		
		//test string parsing
		String str = "RE$45";
		rtri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(4, rtri.getHeight());
		
		str = "RT35"; //3
		rtri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(5, rtri.getHeight());
		
		str = "LTH1";
		rtri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, rtri.getHeight());
		
		str = "LTH15";	//make sure that height is single digits only
		rtri.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, rtri.getHeight());
	}

	@Test
	public void testWidth()
	{
		RightTriangle rtri = new RightTriangle();
		
		rtri.setWidth(5);	//test normal number
		assertEquals(5, rtri.getWidth());
		
		rtri.setWidth(5000);	//test big number
		assertEquals(5000, rtri.getWidth());
		
		rtri.setWidth(-5000);	//test small number
		assertEquals(-5000, rtri.getWidth());
		
	}

}
