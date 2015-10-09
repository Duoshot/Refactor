
public class RightTriangle extends Draw {

	public RightTriangle() 
	{
		appearance = '\0';
		height = 0;
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
	
	
}
