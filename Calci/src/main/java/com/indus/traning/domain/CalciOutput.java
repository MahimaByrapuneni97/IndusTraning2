package com.indus.traning.domain;

public class CalciOutput {
	private double par1;
	private double par2;
	private double result;
	private String operations = "operations";

	@Override
	public String toString() {
		return "CalciOutput [par1=" + par1 + ", par2=" + par2 + ", result=" + result + ", operations=" + operations
				+ "]";
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

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operations == null) ? 0 : operations.hashCode());
		long temp;
		temp = Double.doubleToLongBits(par1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(par2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.result);
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
		CalciOutput other = (CalciOutput) obj;
		if (operations == null) {
			if (other.operations != null)
				return false;
		} else if (!operations.equals(other.operations))
			return false;
		if (Double.doubleToLongBits(par1) != Double.doubleToLongBits(other.par1))
			return false;
		if (Double.doubleToLongBits(par2) != Double.doubleToLongBits(other.par2))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}

	public CalciOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
}
