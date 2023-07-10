package com.indus.traning.serviceimpl;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.expection.CalciExpection;
import com.indus.traning.service.ICalci;

public class Calci implements ICalci {

	public CalciOutput addition(CalciInput calInput) throws CalciExpection {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciExpection("Input object cannot be null");
			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = par1 + par2;
					calOutObj = new CalciOutput();
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);
					calOutObj.setOperations("addition");
				} catch (Exception e) {
					throw new CalciExpection("unknown exception arised", e);
				}

			}
		}
		return calOutObj;
	}

	public CalciOutput subtraction(CalciInput calInput) throws CalciExpection {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciExpection("Input object cannot be null");
			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = par1 - par2;
					calOutObj = new CalciOutput();
					calOutObj.setOperations("subtraction");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);
				} catch (Exception e) {
					throw new CalciExpection("unknow exception arised", e);
				}

			}

		}
		return calOutObj;
	}

	public CalciOutput multiplication(CalciInput calInput) throws CalciExpection {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciExpection("Input object cannot be null");
			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = par1 * par2;
					calOutObj = new CalciOutput();
					calOutObj.setOperations("multiplication");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);
				} catch (Exception e) {
					throw new CalciExpection("unknow exception arised", e);
				}

			}

		}
		return calOutObj;
	}

	public CalciOutput division(CalciInput calInput) throws CalciExpection {
		CalciOutput calOutObj = null;
		{
			if (calInput == null) {
				throw new CalciExpection("Input object cannot be null");
			} else if (calInput.getPar2() == 0) {

				throw new CalciExpection("demonitor cannot be zero");

			} else {
				try {
					double par1 = calInput.getPar1();
					double par2 = calInput.getPar2();
					double result = par1 / par2;
					calOutObj = new CalciOutput();
					calOutObj.setOperations("division");
					calOutObj.setPar1(par1);
					calOutObj.setPar2(par2);
					calOutObj.setResult(result);
				} catch (Exception e) {
					throw new CalciExpection("unknow exception arised", e);
				}

			}

		}
		return calOutObj;
	}

}
