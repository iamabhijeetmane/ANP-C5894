package oops;

abstract class Shape1
{
	//creating abstract methods
	
	public abstract void calculatearea();
	public abstract void calculateperimeter();
	
}

//subclass inherits Shape1
class Rectangle1 extends Shape1
{
	public void calculatearea()
	{
		System.out.println("Area of a rectangle:" );
		
	}
	
	public void calculateperimeter() {
		System.out.println("Perimeter of a rectangle:" );
	}
}
//subclass inherits Shape1
class Circle1 extends Shape1
{
	public void calculatearea()
	{
		System.out.println("Area of a Circle:" );
		
	}
	
	public void calculateperimeter() {
		System.out.println("Perimeter of a Circle:" );
	}
	
}
//subclass inherits Shape1
class Triangle extends Shape1
{
	public void calculatearea()
	{
		System.out.println("Area of a Triangle:" );
		
	}
	
	public void calculateperimeter() {
		System.out.println("Perimeter of a Triangle:" );
	}
	
}
//main class
class Shape1Main
{
	public static void main(String[] args)
	{
		//creating object of  Rectangle1 subclass
		Rectangle1 r=new Rectangle1(); 
		r.calculatearea();
		r.calculateperimeter();
		//creating object of  Circle1 subclass
		Circle1 c=new Circle1(); 
		c.calculatearea();
		c.calculateperimeter();
		//creating object of Triangle subclass
		Triangle t=new Triangle(); 
		t.calculatearea();
		t.calculateperimeter();
	}
}