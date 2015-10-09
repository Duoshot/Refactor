import java.util.Scanner;

public class Main {

	
	public static void main(String [] args) throws Exception
	{	
		Print print = new Print();
		
		Print.printBanner();
		
		
		while(true)
		{
			Print.printInstructions();
			
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
				Print.numRec++;
			}
			else if(shape.equals("RT"))
			{
				draw.appearance = line.charAt(2);  // get the symbol used to draw the shape
				draw.height = Integer.parseInt(line.substring(3)); //Get the size
				draw.drawRightTriangle();
				Print.numRightTri++;
			}
		
			else if(shape.equals("LT"))
			{
				draw.appearance = line.charAt(2);  // get the symbol used to draw the shape
				draw.height = Integer.parseInt(line.substring(3)); //Get the size
				draw.drawLeftTriangle();
				Print.numLeftTri++;
			}
			else if(shape.equals("PR"))
			{
				Print.getCounter();
			}
			else
			{
				System.out.println("Something bad happened!");
				System.exit(0);
			}
		
		}
	
	}
}
