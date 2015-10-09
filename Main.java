import java.util.Scanner;

public class Main {

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
	
		System.out.print("Enter shape (RE,LT,RT), shape appearance, and shape dimensions (width,height). E.g. RE*33: ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();		
	
		
		if (line == "")
		{
            System.out.println("Empty line");
            System.exit(0);         // terminate if file is empty
        }

		String shape = ""; // initialize everything to the base case
		char a = '\0';
		int h = 0;
		int w = 0;
		int s = 0;
			
		shape = line.substring(0,2); //parse the string from the file into the first 2 characters
		
		switch(shape)
		{
			case"RE":
				a = line.charAt(2); // get the symbol used to draw the shape
				h = Integer.parseInt(line.substring(3,4)); // get height
				w = Integer.parseInt(line.substring(4)); // get width
			
				System.out.println("Rectangle");
				for(int i = 0; i < h; i++)
				{ 
					for(int j = 0; j < w; j++)
					{
						System.out.print(a);
					}
					System.out.println();
				}
				System.out.println();
				break;
		
			case"RT":
				a = line.charAt(2);  // get the symbol used to draw the shape
				h = Integer.parseInt(line.substring(3)); //Get the size
			
				System.out.println("Right triangle");
				for(int i = 1; i <= h; i++)
				{
					for(int j = h; j > 0; j--)
					{
						if(i < j)
							System.out.print(" ");
						else
							System.out.print(a);
					}
					System.out.println();
				}
				break;
		
			case"LT":
				a = line.charAt(2);  // get the symbol used to draw the shape
				h = Integer.parseInt(line.substring(3)); //Get the size
			
				for(int i = 0; i < h; i++)
				{
					for(int j = h; j > i; j--)
					{
						System.out.print(a);
					}
					System.out.println();
				}
				System.out.println("Left triangle");
			
				break;
			
			default:
				System.out.println("Something bad happened!");
			}
		
		}
	
	}
}
