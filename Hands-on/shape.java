package oops;

class Shape {
	// method
	public void calculatearea() {
		
		System.out.println("Calculating area of the shape");
	
	}
}
//inherit from Shape	
class Rectangle extends Shape{
	// method	
	public void calculatearea() {
		
		System.out.println("Calculating the area of a rectangle.");
	}
}

class ShapeMain{

	public static void main(String[] args) {
		//creating object of sub class
		Rectangle r =new Rectangle();
		//access fields and methods
		r.calculatearea();
		
		
		
	}
		
			
	}




