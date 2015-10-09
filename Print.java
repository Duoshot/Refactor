
public class Print {

	public static int numRec;
	public static int numRightTri;
	public static int numLeftTri;
	
	public Print()
	{
		numRec = 0;
		numRightTri = 0;
		numLeftTri = 0;
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
	
	public static void getCounter()
	{
		System.out.println("Totals for number of shapes drawn:");
		System.out.print("	Rectangles: ");
		System.out.println(numRec);
		System.out.print("	Right Triangles: ");
		System.out.println(numRightTri);
		System.out.print("	Left Triangles: ");
		System.out.println(numLeftTri);
		System.out.println();
	}
	
	public static void printInstructions()
	{
		System.out.println("To draw a rectangle, enter RE<appearance><height><width>, e.g. RE#45");
		System.out.println("To draw a right triangle, enter RT<appearance><height>, e.g. RT^3");
		System.out.println("To draw a left triangle, enter LT<appearance><height>, e.g. LT@6");
		System.out.println("To display how many shapes have been drawn, enter PR");
	}
	
	
}
