package br.edu.ifsp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.request.converters.Calculators;
import br.edu.ifsp.request.converters.NumbersVerification;

@RestController
public class MathController {
	
	private Calculators calc = new Calculators();
	private NumbersVerification verif = new NumbersVerification();
	
	@RequestMapping(value= "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne,
					  @PathVariable("numberTwo") String numberTwo) throws Exception {

		verif.verification(numberOne, numberTwo);

		Double sum = calc.sum(numberOne, numberTwo);
		return sum;
	}
	
	@RequestMapping(value= "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne,
							  @PathVariable("numberTwo") String numberTwo) throws Exception {

		verif.verification(numberOne, numberTwo);
		
		Double sub = calc.sub(numberOne, numberTwo);
		return sub;
	}
	
	@RequestMapping(value= "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne,
							  @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		verif.verification(numberOne, numberTwo);
		
		Double mult = calc.mult(numberOne, numberTwo);
		return mult;
	}
	
	@RequestMapping(value= "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne,
							  @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		verif.verification(numberOne, numberTwo);
		
		Double div = calc.div(numberOne, numberTwo);
		return div;
	}
	
	@RequestMapping(value= "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne,
							  @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		verif.verification(numberOne, numberTwo);
		
		Double med = calc.mean(numberOne, numberTwo);
		return med;
	}
	
	@RequestMapping(value= "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {

		verif.verificationOne(number);
		
		Double sqr = calc.sqr(number);	
		return sqr;
	}
}
