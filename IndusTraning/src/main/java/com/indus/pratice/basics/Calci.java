package com.indus.pratice.basics;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;

public class Calci {
public CalciOutput addition(CalciInput calInput) {
	CalciOutput calOutObj = new CalciOutput();
	{
		Double par1 = calInput.getPar1();
		Double par2 = calInput.getPar2();
		Double result = par1 + par2;
		calOutObj = new CalciOutput();
		calOutObj.setPar1(par1);
		calOutObj.setPar2(par2);
		calOutObj.setResult(result);
		calOutObj.setOperation("addition");
		
	}
	return calOutObj;
	
}
}
