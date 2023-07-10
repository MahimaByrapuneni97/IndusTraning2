package com.indus.traning.service;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.expection.CalciExpection;

public interface ICalci {
	public CalciOutput addition(CalciInput calInput) throws CalciExpection;

	public CalciOutput subtraction(CalciInput calInput) throws CalciExpection;

	public CalciOutput multiplication(CalciInput calInput) throws CalciExpection;

	public CalciOutput division(CalciInput calInput) throws CalciExpection;
}
