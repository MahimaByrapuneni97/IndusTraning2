package com.indus.traning.service;

public class Calc {
	public double addition(double par1, double par2) {

		double result = 0.0;
		{

			result = par1 + par2;
		}
		System.out.println("the output of addition " +result);
		return result;
	}
	
	public double subtraction(double par1, double par2) {

		double result = 0.0;
		{

			result = par1 - par2;
		}
		return result;
	}

	public double multiplication(double parameter1, double parameter2) {
		double result = 0.0;
		{
			result = parameter1 * parameter2;
		}
		return result;
	}

	public double division(double parmeter1, double parmeter2) {
		double result = 0.0;
		{
			result = parmeter1 / parmeter2;
		}
		return result;

	}
}
