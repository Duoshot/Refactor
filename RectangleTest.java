import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testInit()
	{
		Rectangle rect = new Rectangle();
		assertEquals('\0', rect.getAppearance());
		assertEquals(0, rect.getHeight());
		assertEquals(0, rect.getWidth());
	}
	

	@Test //test appearance setters and getters
	public void testAppearance()
	{
		Rectangle rect = new Rectangle();
		rect.setAppearance('3');	//test number appearance
		assertEquals('3', rect.getAppearance());
		
		rect.setAppearance('z');	//test letter appearance
		assertEquals('z', rect.getAppearance());
		
		rect.setAppearance('#');	//test symbol appearance
		assertEquals('#', rect.getAppearance());
		
		rect.setAppearance('"');	//test code appearance
		assertEquals('"', rect.getAppearance());
		
		rect.setAppearance('=');	//test symbols that could be in code
		assertEquals('=', rect.getAppearance());
		
		//test if the input from a string is parsed correctly
		String str = "RE$45";	//rectangle symbol $
		rect.setAppearance(str.charAt(2));
		assertEquals('$', rect.getAppearance());
		
		str = "RT35"; //3
		rect.setAppearance(str.charAt(2));
		assertEquals('3', rect.getAppearance());
		
		str = "LTH1"; //H
		rect.setAppearance(str.charAt(2));
		assertEquals('H', rect.getAppearance());
	}
	
	@Test
	public void testHeight()
	{
		Rectangle rect = new Rectangle();
		
		rect.setHeight(6);		//normal number
		assertEquals(6, rect.getHeight());
		
		rect.setHeight(6000);		//real big number
		assertEquals(6000, rect.getHeight());
		
		rect.setHeight(-6000);		//real small number
		assertEquals(-6000, rect.getHeight());
		
		//test string parsing
		String str = "RE$45";
		rect.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(4, rect.getHeight());
		
		str = "RT35"; //3
		rect.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(5, rect.getHeight());
		
		str = "LTH1";
		rect.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, rect.getHeight());
		
		str = "LTH15";	//make sure that height is single digits only
		rect.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, rect.getHeight());
	}

	@Test
	public void testWidth()
	{
		Rectangle rect = new Rectangle();
		
		rect.setWidth(5);	//test normal number
		assertEquals(5, rect.getWidth());
		
		rect.setWidth(5000);	//test big number
		assertEquals(5000, rect.getWidth());
		
		rect.setWidth(-5000);	//test small number
		assertEquals(-5000, rect.getWidth());
		
		String str = "RE$45";	//only rectangle has width
		rect.setWidth(Integer.parseInt(str.substring(4,5)));
		assertEquals(5, rect.getWidth());
		
		str = "RE$457";			//make sure width is single digit int
		rect.setWidth(Integer.parseInt(str.substring(4,5)));
		assertEquals(5, rect.getWidth());
	}

}
