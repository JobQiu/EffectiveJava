package com.qcm.learnEffectiveJava.item_08;


/**
 * 
 * @author Congmin Qiu 
 */
public class item8 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object object){
		if (object == this)
			return true;

		if (!(object instanceof item8))
			return false;

		item8 temp = (item8) object;
		// start to compare each fields, and judge if they are same!
		if (temp.getName().equals(this.name)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		item8 i = new item8();
		System.out.println(i.equals(i));
	}
}
