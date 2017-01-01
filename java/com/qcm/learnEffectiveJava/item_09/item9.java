package com.qcm.learnEffectiveJava.item_09;

import com.qcm.learnEffectiveJava.item_08.item8;

/**
 * 
 * @author Congmin Qiu 
 */
public class item9 extends item8 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this)
			return true;

		if (!(object instanceof item9))
			return false;

		item9 temp = (item9) object;
		// start to compare each fields, and judge if they are same!
		if (temp.getName().equals(this.getName()) && temp.getAge() == this.age) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		item8 i = new item8();
		i.setName("123");
		item9 ii = new item9();
		ii.setAge(1);
		ii.setName("123");
		System.out.println("子类equals父类？ " + ii.equals(i));
		System.out.println("付类equalszi类？  " + i.equals(ii));

		System.out.println("item8's(i) hash code is " + i.hashCode());
		System.out.println("item9's(ii) hash code is " + ii.hashCode());
		item8 temp = (item8) ii;
		System.out.println("temp's(ii -> item8 ) hash code is "
				+ temp.hashCode() + " which should be similar with i");
		System.out.println(temp.getName());

	}

}
