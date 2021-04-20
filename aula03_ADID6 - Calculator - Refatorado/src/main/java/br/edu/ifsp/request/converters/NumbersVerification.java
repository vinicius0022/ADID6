package br.edu.ifsp.request.converters;

import br.edu.ifsp.exception.UnsuportedMathOperationException;

public class NumbersVerification {
	
	public void verification(String strNum1, String strNum2) {
		
		if(!NumbersVerification.isNumeric(strNum1) || !NumbersVerification.isNumeric(strNum2)) {
			throw new UnsuportedMathOperationException("Por favor entre com um valor numérico!");
		}
	}
	
	public void verificationOne(String strNum) {
		
		if(!NumbersVerification.isNumeric(strNum)) {
			throw new UnsuportedMathOperationException("Por favor entre com um valor numérico!");
		}
	}
	
	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) return  0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return  Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
