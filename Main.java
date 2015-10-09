import java.util.Scanner;

public class Main {

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
		System.out.println(rTriangle);
		System.out.print("	Left Triangles: ");
		System.out.println(lTriangle);
		System.out.println();
	}
	
	public static void printInstructions()
	{
		System.out.println("To draw a rectangle, enter RE<appearance><height><width>, e.g. RE#45");
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
			
			Draw draw = new Draw();
			
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();		
	
		
			if (line == "")
			{
				System.out.println("Empty line");
				System.exit(0);         // terminate if file is empty
			}

			String shape = ""; // initialize everything to the base case
			
			shape = line.substring(0,2); //parse the string from the file into the first 2 characters
		
			if(shape.equals("RE"))
			{
				draw.appearance = line.charAt(2); // get the symbol used to draw the shape
				draw.height = Integer.parseInt(line.substring(3,4)); // get height
				draw.width = Integer.parseInt(line.substring(4)); // get width
				draw.drawRectangle();
				numRectangle++;
			}
			else if(shape.equals("RT"))
			{
				draw.appearance = line.charAt(2);  // get the symbol used to draw the shape
				draw.height = Integer.parseInt(line.substring(3)); //Get the size
				draw.drawRightTriangle();
				numRightTriangle++;
			}
		
			else if(shape.equals("LT"))
			{
				draw.appearance = line.charAt(2);  // get the symbol used to draw the shape
				draw.height = Integer.parseInt(line.substring(3)); //Get the size
				draw.drawLeftTriangle();
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
