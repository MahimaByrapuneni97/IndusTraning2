package com.indus.traning.service;

import com.indus.traning.domain.CalciInput;
import com.indus.traning.domain.CalciOutput;
import com.indus.traning.exception.CalciException;

public interface ICalci {
public CalciOutput addition(CalciInput calInput) throws CalciException;
public CalciOutput subtraction(CalciInput calInput) throws CalciException;
public CalciOutput multiplication(CalciInput calInput) throws CalciException;
public CalciOutput division(CalciInput calInput) throws CalciException;
}
