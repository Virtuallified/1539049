import java.lang.Math.*;

abstract class Shape{
public double calcArea(){return 0;};
public double calcPerimeter(){return 0;};
}

class Circle extends Shape{
	private double pi,radius;
	
	public Circle(double pi,double radius){
		this.pi=pi;
		this.radius=radius;
	}
	
	public double calcArea(){
		return pi*radius*radius;
	}
	
	public double calcPerimeter(){
		return 2*pi*radius;
	}

}

class Ellipse extends Shape{
	private double pi,radiusMax,radiusMin;
	
	public Ellipse(double pi,double radiusMax,double radiusMin){
		this.pi=pi;
		this.radiusMax=radiusMax;
		this.radiusMin=radiusMin;
	}
	
	public double calcArea(){
		return pi*radiusMax*radiusMin;
	}
	
	public double calcPerimeter(){
		return 2*pi*Math.sqrt(((radiusMax*radiusMax)+(radiusMin*radiusMin))/2);
	}
}


class Rectangle extends Shape{
	private double length,breadth;
	
	public Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public double calcArea(){
		return length*breadth;
	}
	
	public double calcPerimeter(){
		return 2*(length+breadth);
	}
}


public class TestShape{
	public static void main(String args[]){
		Shape shapes;
		
		shapes = new Circle(3.14,3);
		System.out.println("Area of circle :="+shapes.calcArea());
		System.out.println("Perimeter of circle :="+shapes.calcPerimeter());
		
		shapes = new Ellipse(3.14,4,3);
		System.out.println("Area of Ellipse :="+shapes.calcArea());
		System.out.println("Perimeter of Ellipse :="+shapes.calcPerimeter());
		
		shapes = new Rectangle(4,3);
		System.out.println("Area of Rectangle :="+shapes.calcArea());
		System.out.println("Perimeter of Rectangle :="+shapes.calcPerimeter());
	}
}