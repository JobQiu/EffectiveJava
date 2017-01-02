package com.qcm.learnEffectiveJava.item_23;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Congmin Qiu 
 */
public class item23 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		unsafeAdd(strings, new Integer(42));
		String s = strings.get(0);
	}

	public static void unsafeAdd(List list, Object o) {
		list.add(o);
	}
}
