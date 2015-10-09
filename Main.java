import java.util.Scanner;

public class Main {

	
	public static void main(String [] args) throws Exception
	{	
		Print print = new Print();
		Rectangle rec = new Rectangle();
		RightTriangle rTri = new RightTriangle();
		LeftTriangle lTri = new LeftTriangle();
		
		print.printBanner();
		
		while(true)
		{
			print.printInstructions();
			
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
				rec.setAppearance(line.charAt(2)); // get the symbol used to draw the shape
				rec.setHeight(Integer.parseInt(line.substring(3,4))); // get height
				rec.setWidth(Integer.parseInt(line.substring(4,5))); // get width
				rec.drawRectangle();
				print.addNumRec();;
			}
			else if(shape.equals("RT"))
			{
				rTri.setAppearance(line.charAt(2));  // get the symbol used to draw the shape
				rTri.setHeight(Integer.parseInt(line.substring(3,4))); //Get the size
				rTri.drawRightTriangle();
				print.addNumRightTri();
			}
		
			else if(shape.equals("LT"))
			{
				lTri.setAppearance(line.charAt(2));  // get the symbol used to draw the shape
				lTri.setHeight(Integer.parseInt(line.substring(3,4))); //Get the size
				lTri.drawLeftTriangle();
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
