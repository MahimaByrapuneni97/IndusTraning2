package com.indus.traning.domain;

public class CalciInput {
	private double par1;
	private double par2;

	public CalciInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPar1() {
		return par1;
	}

	public void setPar1(double par1) {
		this.par1 = par1;
	}

	public double getPar2() {
		return par2;
	}

	public void setPar2(double par2) {
		this.par2 = par2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(par1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(par2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(par1) != Double.doubleToLongBits(other.par1))
			return false;
		if (Double.doubleToLongBits(par2) != Double.doubleToLongBits(other.par2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CalciInput [par1=" + par1 + ", par2=" + par2 + "]";
	}

}
