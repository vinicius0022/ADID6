package br.edu.ifsp.request.converters;

public class Calculators {
	
	public Double sum(String numberOne, String numberTwo) {
		return NumbersVerification.convertToDouble(numberOne) + NumbersVerification.convertToDouble(numberTwo);
	}
	
	public Double sub(String numberOne, String numberTwo) {
		return NumbersVerification.convertToDouble(numberOne) - NumbersVerification.convertToDouble(numberTwo);
	}
	
	public Double div(String numberOne, String numberTwo) {
		return NumbersVerification.convertToDouble(numberOne) / NumbersVerification.convertToDouble(numberTwo);
	}
	
	public Double mult(String numberOne, String numberTwo) {
		return NumbersVerification.convertToDouble(numberOne) * NumbersVerification.convertToDouble(numberTwo);
	}
	
	public Double mean(String numberOne, String numberTwo) {
		return (NumbersVerification.convertToDouble(numberOne) + NumbersVerification.convertToDouble(numberTwo)) / 2;
	}
	
	public Double sqr(String number) {
		return  Math.sqrt(NumbersVerification.convertToDouble(number));
	}
	

}
