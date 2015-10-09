import java.util.Scanner;

public class Main {

	public static void drawRectangle(char appearance, int width, int height)
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
	
	public static void drawRightTriangle(char appearance, int height)
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
	
	public static void drawLeftTriangle(char appearance, int height)
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
	
	public static void printBanner()
	{
		System.out.println("Last Name: Law");
		System.out.println("First Name: Gorman");
		System.out.println("Student ID: 10053913");
		System.out.println("Course: CPSC 233");
		System.out.println("Tutorial Section: 2");
		System.out.println("Assignment: 2");
		System.out.println();
		System.out.println("CPSC 501 Refactor");
		System.out.println();
	}
	
	public static void getCounter (int rectangle, int rTriangle, int lTriangle)
	{
		System.out.println("Totals for number of shapes drawn:");
		System.out.print("	Rectangles: ");
		System.out.println(rectangle);
		System.out.print("	Right Triangles: ");
		System.out.print(rTriangle);
		System.out.print("	Left Triangles: ");
		System.out.println(lTriangle);
		System.out.println();
	}
	
	public static void printInstructions()
	{
		System.out.println("To draw a rectangle, enter RE<appearance><width><height>, e.g. RE#45");
		System.out.println("To draw a right triangle, enter RT<appearance><height>, e.g. RT^3");
		System.out.println("To draw a left triangle, enter LT<appearance><height>, e.g. LT@6");
		System.out.println("To display how many shapes have been drawn, enter PR");
	}
	
	public static void main(String [] args) throws Exception
	{
		int numRectangle = 0;
		int numRightTriangle = 0;
		int numLeftTriangle = 0;
		
		printBanner();
		
		
		while(true)
		{
			printInstructions();
			
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();		
	
		
			if (line == "")
			{
				System.out.println("Empty line");
				System.exit(0);         // terminate if file is empty
			}

			String shape = ""; // initialize everything to the base case
			char appearance = '\0';
			int height = 0;
			int width = 0;
			
			shape = line.substring(0,2); //parse the string from the file into the first 2 characters
		
			if(shape.equals("RE"))
			{
				appearance = line.charAt(2); // get the symbol used to draw the shape
				height = Integer.parseInt(line.substring(3,4)); // get height
				width = Integer.parseInt(line.substring(4)); // get width
				drawRectangle(appearance, height, width);
				numRectangle++;
			}
			else if(shape.equals("RT"))
			{
				appearance = line.charAt(2);  // get the symbol used to draw the shape
				height = Integer.parseInt(line.substring(3)); //Get the size
				drawRightTriangle(appearance, height);
				numRightTriangle++;
			}
		
			else if(shape.equals("LT"))
			{
				appearance = line.charAt(2);  // get the symbol used to draw the shape
				height = Integer.parseInt(line.substring(3)); //Get the size
				drawLeftTriangle(appearance, height);
				numLeftTriangle++;
			}
			else if(shape.equals("PR"))
			{
				getCounter(numRectangle, numRightTriangle, numLeftTriangle);
			}
			else
			{
				System.out.println("Something bad happened!");
				System.exit(0);
			}
		
		}
	
	}
}
