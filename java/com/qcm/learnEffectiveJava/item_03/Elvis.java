package com.qcm.learnEffectiveJava.item_03;

/**
 * 有的类只希望存在一个单例
 * 
 * 
 * @author Congmin Qiu
 */
public class Elvis {
	private static final Elvis INSTANCE = new Elvis();

	public Elvis getInstance() {
		return INSTANCE;
	}

	/**
	 * 结合item4 如果希望不可实例化 缺点是不可子类化
	 * */
	private Elvis() {
		throw new AssertionError();
	}

}
