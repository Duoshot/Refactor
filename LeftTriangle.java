
public class LeftTriangle extends Draw {

	public LeftTriangle() 
	{
		appearance = '\0';
		height = 0;
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
