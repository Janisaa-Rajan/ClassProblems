package com.example.Interface;

public class Square  implements Shape1{
	double radius = 4;
	@Override
	public void calculate_area() {
		double result = radius*radius;
		System.out.println("Area of Square = " +result);
	}

}
