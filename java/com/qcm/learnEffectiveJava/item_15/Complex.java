package com.qcm.learnEffectiveJava.item_15;
/**
 * 
 * @author Congmin Qiu 
 */
public class Complex {

	private final double re;
	private final double im;

	private Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	};

	public static Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}

}
