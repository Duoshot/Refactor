
public class Draw {

	public static char appearance;
	public static int height;
	public static int width;
	
	public Draw()
	{
		appearance = '\0';
		height = 0;
		width = 0;
	}
	
	public void drawRectangle()
	{
		System.out.println("Rectangle");
		for(int i = 0; i < height; i++)
		{ 
			for(int j = 0; j < width; j++)
			{
				System.out.print(appearance);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void drawRightTriangle()
	{
		System.out.println("Right triangle");
		for(int i = 1; i <= height; i++)
		{
			for(int j = height; j > 0; j--)
			{
				if(i < j)
					System.out.print(" ");
				else
					System.out.print(appearance);
			}
			System.out.println();
		}
	}
	
	public static void drawLeftTriangle()
	{
		for(int i = 0; i < height; i++)
		{
			for(int j = height; j > i; j--)
			{
				System.out.print(appearance);
			}
			System.out.println();
		}
		System.out.println("Left triangle");
	}
}
