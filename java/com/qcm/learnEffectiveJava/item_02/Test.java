package com.qcm.learnEffectiveJava.item_02;


/**
 * 
 * @author Congmin Qiu 
 */
public class Test {
	public static void main(String[] args) {
		Item2 test = new Item2.Builder("root", "123").age(10)
				.email("qcm3771787@163.com").realname("congminqiu").build();

	}
}
