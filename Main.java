import java.util.Scanner;

public class Main {

	public static void func1(char appearance, int width, int height)
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
	
	public static void func2(char appearance, int height)
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
	
	public static void func3(char appearance, int height)
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
	
	public static void main(String [] args) throws Exception
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

		while(true)
		{
	
			System.out.println("Enter shape (RE,LT,RT), shape appearance, and shape dimensions (width,height). E.g. RE*33, or enter anything to quit");

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
				func1(appearance, height, width);
			}
			else if(shape.equals("RT"))
			{
				appearance = line.charAt(2);  // get the symbol used to draw the shape
				height = Integer.parseInt(line.substring(3)); //Get the size
				func2(appearance, height);
			}
		
			else if(shape.equals("LT"))
			{
				appearance = line.charAt(2);  // get the symbol used to draw the shape
				height = Integer.parseInt(line.substring(3)); //Get the size
				func3(appearance, height);
			}
			else
			{
				System.out.println("Something bad happened!");
				System.exit(0);
			}
		
		}
	
	}
}
