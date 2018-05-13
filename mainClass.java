package volumeOrArea;
import java.util.Scanner;
public class mainClass {

	public static void main(String[] args) {
		  System.out.println("Enter either Volume or Area.");
		Scanner ihtw = new Scanner(System.in);	
		String formula = ihtw.nextLine();
		if (formula.equalsIgnoreCase("area"))
		 {
		  System.out.println("Do you want a circle, a triangle, a trapezoid, or a rectangle");
			 String shape = ihtw.nextLine();
			 if(shape.equalsIgnoreCase("circle"))
			 {
				 Formulas circles= new Formulas();
				 circles.circle();

			 }
			 else if(shape.equalsIgnoreCase("triangle"))	 
			{
				Formulas triangles = new Formulas();
				triangles.triangle();
				
			}
		 
			 else if (shape.equalsIgnoreCase("trapezoid"))
			 {
			 Formulas trapezoids = new Formulas();
			 trapezoids.trapezoid();
			 }
			 else if (shape.equalsIgnoreCase("rectangle"))
			 {
			 Formulas rekt = new Formulas();
			 rekt.square();
			 
			 }
			 else
			 {
				 System.out.println("Error! Try again.");
			 }
				
		 }
			 
	
		 
		 else if (formula.equalsIgnoreCase("volume"))
		 {
			 System.out.println("Do you want a rectangular prism, a cylinder, or a pyramid?");
			 String shape = ihtw.nextLine();
		 
		    if (shape.equalsIgnoreCase("rectangular prism"))
		    {
		    	Formulas rektpriz= new Formulas();
		    	rektpriz.rectangularPrism();
		    }
		    if (shape.equalsIgnoreCase("cylinder"))
		    {
			 Formulas can= new Formulas();
			 can.cylinder();
			 
		    }
		    if (shape.equalsIgnoreCase("pyramid"))
		    {
		 	 Formulas tut = new Formulas();
			 tut.pyramid();
		    }
	
		 }
		    else
		    	System.out.println("If you disobey me...you die.");
 
	}

}

