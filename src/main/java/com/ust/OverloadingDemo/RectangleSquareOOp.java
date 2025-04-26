package com.ust.OverloadingDemo;
import java.util.logging.Logger;
public class RectangleSquareOOp {
	public static Logger logger=Logger.getLogger(RectangleSquareOOp.class.getName() );
	//square
	int area(int side)
	{
		return side*side;
	}
    //Rectangle
	double area(int length,int breadth)
	{
		return length*breadth;
	}
	//circle
	double area(double radius)
	{
		return 3.14*radius*radius;
	}
	//triangle
	double area(double base,double height)
	{
		return 0.5*base*height;
	}
	public static void main(String[] args) {
		RectangleSquareOOp c=new RectangleSquareOOp();
		logger.info("Area of Square"+c.area(5));
		logger.info("Area of Rectangle"+c.area(4,6));
		logger.info("Area of circle"+c.area(3.5));
		logger.info("Area of Triangle"+"  "+c.area(5.0,4.1));
		
	}
}
