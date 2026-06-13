package com.example.Interface;

public class Sphere implements Shape1,Shape2{
	double radius= 5.6;
	@Override
	public void calculate_volume() {
		double result = ((4/3)*pi*radius*radius*radius);
		System.out.println("Volume of Sphere =" +result);
	}
	@Override
	public void calculate_area() {
		double result = (4*pi*radius*radius);
		System.out.println("Area of Sphere =" +result);
		
	}

}
