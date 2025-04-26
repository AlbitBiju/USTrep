package com.ust.OverloadingDemo;
import java.util.logging.Logger;
public class Calculator {
	public static Logger log=Logger.getLogger(Calculator.class.getName());
	public int add(int a1,int a2)
	{
		log.info("tf");
		return a1+a2;
		
		
	}
	public double add(double b1,double b2)
	{
		return b1+b2;
		
	}
	public String add(String s1,String s2,String s3)
	{
		return s1+s2+s3;
	}
public static void main(String[] args) {
	Calculator c=new Calculator();
	log.info("add"+"   "+c.add(3, 4));
	System.out.println(c.add(3.5, 4.7));
	 System.out.println(c.add("a", "b","c"));
	
}
}
