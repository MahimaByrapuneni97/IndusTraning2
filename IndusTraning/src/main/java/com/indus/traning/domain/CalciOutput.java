package com.indus.traning.domain;

public class CalciOutput {
private Double par1;
private Double par2;
private Double result;
@Override
public String toString() {
	return "CalciOutput [par1=" + par1 + ", par2=" + par2 + ", result=" + result + ", operation=" + operation + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((operation == null) ? 0 : operation.hashCode());
	result = prime * result + ((par1 == null) ? 0 : par1.hashCode());
	result = prime * result + ((par2 == null) ? 0 : par2.hashCode());
	result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CalciOutput other = (CalciOutput) obj;
	if (operation == null) {
		if (other.operation != null)
			return false;
	} else if (!operation.equals(other.operation))
		return false;
	if (par1 == null) {
		if (other.par1 != null)
			return false;
	} else if (!par1.equals(other.par1))
		return false;
	if (par2 == null) {
		if (other.par2 != null)
			return false;
	} else if (!par2.equals(other.par2))
		return false;
	if (result == null) {
		if (other.result != null)
			return false;
	} else if (!result.equals(other.result))
		return false;
	return true;
}
public Double getPar1() {
	return par1;
}
public void setPar1(Double par1) {
	this.par1 = par1;
}
public Double getPar2() {
	return par2;
}
public void setPar2(Double par2) {
	this.par2 = par2;
}
public Double getResult() {
	return result;
}
public void setResult(Double result) {
	this.result = result;
}
public String getOperation() {
	return operation;
}
public void setOperation(String operation) {
	this.operation = operation;
}
public CalciOutput() {
	super();
	// TODO Auto-generated constructor stub
}
private String operation = "operation";
}