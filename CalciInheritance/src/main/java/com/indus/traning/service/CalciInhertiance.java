package com.indus.traning.service;

public class CalciInhertiance extends Calc {
	public double square(double par1)
	{
	double result =0.0;	
	{
	result = Math.sqrt(par1);
	}
return result;

}
	public double addition(double par1, double par2) {

		double result = 0.0;
		{

			result = par1 + par2;
		}
		System.out.println("addition of two numbers" +result);
		return result;
	}
	
	
}
