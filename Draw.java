
public class Draw {

	private char appearance;
	private int height;
	private int width;
	
	public Draw()
	{
		appearance = '\0';
		height = 0;
		width = 0;
	}
	
	public void setAppearance(char a)
	{
		appearance = a;
	}
	
	public char getAppearance()
	{
		return appearance;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public int getWidth()
	{
		return width;
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
	
	public void drawRightTriangle()
	{
		System.out.println("Right triangle");
		for(int i = 1; i <= getHeight(); i++)
		{
			for(int j = getHeight(); j > 0; j--)
			{
				if(i < j)
					System.out.print(" ");
				else
					System.out.print(getAppearance());
			}
			System.out.println();
		}
	}
	
	public void drawLeftTriangle()
	{
		for(int i = 0; i < getHeight(); i++)
		{
			for(int j = getHeight(); j > i; j--)
			{
				System.out.print(getAppearance());
			}
			System.out.println();
		}
		System.out.println("Left triangle");
	}
}
