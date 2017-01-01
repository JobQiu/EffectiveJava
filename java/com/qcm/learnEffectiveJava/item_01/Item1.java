package com.qcm.learnEffectiveJava.item_01;


/**
 * 
 * 
 * @author Congmin Qiu Dec 21, 2016
 * 
 */
public class Item1 {

	public static void main(String[] args) {
		System.out.println(Item1.newInstance("qcm").getName());
	}

	private String name;

	/** new 往往是新建一个实例然后返回 get是单例是返回一个 */
	public static Item1 newInstance(String name) {
		Item1 i = new Item1();
		i.setName(name);
		return i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

