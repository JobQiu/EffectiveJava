package com.qcm.learnEffectiveJava.item_25;


/**
 * 
 * @author Congmin Qiu 
 */
public class Item25 {
	public static void main(String[] args) {

		/** 使用 array， it will pass the compile */
		// Object[] objects = new Long[1];
		// objects[0] = "i dont fit in";

		/** using arraylist, it will not pass the compile */
		// List<Long> ol = new ArrayList<Long>();
		// ol.add("i dont fit in");

		/**
		 * conclusion, we d better using list, cause it can help us to check the
		 * generic and cast problems
		 * */
	}
}
