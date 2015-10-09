
public class Rectangle extends Draw {
	
	public Rectangle() {
		appearance = '\0';
		height = 0;
		width = 0;
	}
	
	public void drawRectangle()
	{
		System.out.println("Rectangle");
		for(int i = 0; i < getHeight(); i++)
		{ 
			for(int j = 0; j < getWidth(); j++)
			{
				System.out.print(getAppearance());
			}
			System.out.println();
		}
		System.out.println();
	}
	

}
