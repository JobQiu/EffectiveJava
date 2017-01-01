package com.qcm.learnEffectiveJava.item_21;
/**
 * 
 * @author Congmin Qiu 
 */
public class StringLengthC implements Comparator<String> {

	public int compare(String t1, String t2) {
		/** */
		return t1.length() - t2.length();
	}

}
