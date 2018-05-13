package volumeOrArea;

import java.util.Scanner;

public class Formulas {
	private double b1;
	private double b2;
	private double h;
	private double r;
	private double w;

	private Scanner geo = new Scanner(System.in);
	
	public Formulas () {
		
}
	
	public void pyramid() {
		System.out.println("Enter a base, then enter a height");
		b1 = geo.nextDouble();
		h = geo.nextDouble();
		System.out.println((b1*h)/3.0 + " cubic units");

		
	}
	
	public void cylinder() {
		System.out.println("Enter the radius, then enter the height.");
		r = geo.nextDouble();
		h = geo.nextDouble();
		System.out.println(3.14*h*r*r + " cubic units");

			
	}

	public void rectangularPrism() {
		System.out.println("Enter the base, then the height, then finally the width.");
		b1 = geo.nextDouble();
		h = geo.nextDouble();
		w = geo.nextDouble();
		System.out.println(b1*h*w + " cubic units");
		
	}

	public void trapezoid() {
		System.out.println("Enter base 1, then base 2, then the height.");
		b1 = geo.nextDouble();
		b2 = geo.nextDouble();
		h = geo.nextDouble();
		System.out.println((b1+b2)/2.0*h + " square units");
	
	}
	
	public void triangle() {
		System.out.println("Enter a base, then a height.");
		b1 = geo.nextDouble();
		h = geo.nextDouble();
		System.out.println(0.5*b1*h + " square units");
	
	}
	
	public void circle() {
		System.out.println("Enter the radius.");
		r = geo.nextDouble();
		System.out.println(3.14*r*r + " square units");
	
	}
	
	public void square() {
		System.out.println("Enter the height.");
		h = geo.nextDouble();
		System.out.println(h*h + " square units");
		
	}
}