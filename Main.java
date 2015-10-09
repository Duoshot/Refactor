import java.util.Scanner;

public class Main {

	
	public static void main(String [] args) throws Exception
	{	
		Print print = new Print();
		
		print.printBanner();
		
		
		while(true)
		{
			print.printInstructions();
			
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
				draw.setAppearance(line.charAt(2)); // get the symbol used to draw the shape
				draw.setHeight(Integer.parseInt(line.substring(3,4))); // get height
				draw.setWidth(Integer.parseInt(line.substring(4))); // get width
				draw.drawRectangle();
				print.addNumRec();;
			}
			else if(shape.equals("RT"))
			{
				draw.setAppearance(line.charAt(2));  // get the symbol used to draw the shape
				draw.setHeight(Integer.parseInt(line.substring(3))); //Get the size
				draw.drawRightTriangle();
				print.addNumRightTri();
			}
		
			else if(shape.equals("LT"))
			{
				draw.setAppearance(line.charAt(2));  // get the symbol used to draw the shape
				draw.setHeight(Integer.parseInt(line.substring(3))); //Get the size
				draw.drawLeftTriangle();
				print.addNumLeftTri();
			}
			else if(shape.equals("PR"))
			{
				print.getCounter();
			}
			else
			{
				System.out.println("Something bad happened!");
				System.exit(0);
			}
		
		}
	
	}
}
