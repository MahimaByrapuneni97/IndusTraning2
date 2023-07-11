package com.indus.traning.serviceimpl;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.exception.CalciException;
import com.indus.traning.service.ICalci;

public class Calci implements ICalci {
	
	private static ICalci calObj = null;

	private Calci() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ICalci getInstance() {
		
		if( calObj == null) {
			calObj = new Calci();
		}

		return calObj;
	}

	public CalciOutput addition(CalciInput calInput) throws CalciException {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciException("objects cannot be null");

			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = calInput.getPar1() + calInput.getPar2();
					calOutObj = new CalciOutput();
					calOutObj.setOperations("addition");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);

				} catch (Exception e) {
					throw new CalciException("unknown exception araised", e);
				}
			}
		}
		return calOutObj;
	}
	
	public CalciOutput subtraction(CalciInput calInput) throws CalciException {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciException("objects cannot be null");

			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = calInput.getPar1() - calInput.getPar2();
					calOutObj = new CalciOutput();
					calOutObj.setOperations("subtraction");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);

				} catch (Exception e) {
					throw new CalciException("unknown exception araised", e);
				}
			}
		}
		return calOutObj;
	}

	public CalciOutput multiplication(CalciInput calInput) throws CalciException {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciException("objects cannot be null");

			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = calInput.getPar1() * calInput.getPar2();
					calOutObj = new CalciOutput();
					calOutObj.setOperations("multiplication");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);

				} catch (Exception e) {
					throw new CalciException("unknown exception araised", e);
				}
			}
		}
		return calOutObj;
	}

	public CalciOutput division(CalciInput calInput) throws CalciException {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciException("objects cannot be null");

			}else if (calInput.getPar2() == 0) {
				throw new CalciException("denomitor cannot be null");
			}else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = calInput.getPar1() / calInput.getPar2();
					calOutObj = new CalciOutput();
					calOutObj.setOperations("division");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);

				} catch (Exception e) {
					throw new CalciException("unknown exception araised", e);
				}
			}
		}
		return calOutObj;
	}

}
