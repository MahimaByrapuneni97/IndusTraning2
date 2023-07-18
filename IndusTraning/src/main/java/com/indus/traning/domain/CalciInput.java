package com.indus.traning.domain;

public class CalciInput {
 private Double par1;
 private Double par2;
public CalciInput() {
	super();
	// TODO Auto-generated constructor stub
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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((par1 == null) ? 0 : par1.hashCode());
	result = prime * result + ((par2 == null) ? 0 : par2.hashCode());
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
	CalciInput other = (CalciInput) obj;
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
	return true;
}
@Override
public String toString() {
	return "CalciInput [par1=" + par1 + ", par2=" + par2 + "]";
}
}