import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DrawTest {

	@Test //test initialization.
	public void testInit() 
	{
		Draw draw = new Draw();
		assertEquals('\0', draw.getAppearance());
		assertEquals(0, draw.getHeight());
		assertEquals(0, draw.getWidth());
	}
	
	@Test //test appearance setters and getters
	public void testAppearance()
	{
		Draw draw = new Draw();
		draw.setAppearance('3');	//test number appearance
		assertEquals('3', draw.getAppearance());
		
		draw.setAppearance('z');	//test letter appearance
		assertEquals('z', draw.getAppearance());
		
		draw.setAppearance('#');	//test symbol appearance
		assertEquals('#', draw.getAppearance());
		
		draw.setAppearance('"');	//test code appearance
		assertEquals('"', draw.getAppearance());
		
		draw.setAppearance('=');	//test symbols that could be in code
		assertEquals('=', draw.getAppearance());
		
		//test if the input from a string is parsed correctly
		String str = "RE$45";	//rectangle symbol $
		draw.setAppearance(str.charAt(2));
		assertEquals('$', draw.getAppearance());
		
		str = "RT35"; //3
		draw.setAppearance(str.charAt(2));
		assertEquals('3', draw.getAppearance());
		
		str = "LTH1"; //H
		draw.setAppearance(str.charAt(2));
		assertEquals('H', draw.getAppearance());
	}
	
	@Test
	public void testHeight()
	{
		Draw draw = new Draw();
		
		draw.setHeight(6);		//normal number
		assertEquals(6, draw.getHeight());
		
		draw.setHeight(6000);		//real big number
		assertEquals(6000, draw.getHeight());
		
		draw.setHeight(-6000);		//real small number
		assertEquals(-6000, draw.getHeight());
		
		//test string parsing
		String str = "RE$45";
		draw.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(4, draw.getHeight());
		
		str = "RT35"; //3
		draw.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(5, draw.getHeight());
		
		str = "LTH1";
		draw.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, draw.getHeight());
		
		str = "LTH15";	//make sure that height is single digits only
		draw.setHeight(Integer.parseInt(str.substring(3,4)));
		assertEquals(1, draw.getHeight());
	}

	@Test
	public void testWidth()
	{
		Draw draw = new Draw();
		
		draw.setWidth(5);	//test normal number
		assertEquals(5, draw.getWidth());
		
		draw.setWidth(5000);	//test big number
		assertEquals(5000, draw.getWidth());
		
		draw.setWidth(-5000);	//test small number
		assertEquals(-5000, draw.getWidth());
		
		String str = "RE$45";	//only rectangle has width
		draw.setWidth(Integer.parseInt(str.substring(4,5)));
		assertEquals(5, draw.getWidth());
		
		str = "RE$457";			//make sure width is single digit int
		draw.setWidth(Integer.parseInt(str.substring(4,5)));
		assertEquals(5, draw.getWidth());
	}
}
