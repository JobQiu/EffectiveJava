package com.qcm.learnEffectiveJava.item_09;

import java.sql.Date;

/**
 * 
 * @author Congmin Qiu 
 */
public class Human {
	public static final Date INITIAL_DATE = new Date(12, 00, 00);
	// 避免创建多余的date
	
	private String name = "";
	private int age = 0;
	private Date birthday = INITIAL_DATE;
	private boolean sex = true; // true = male;
	private float money = 0;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public static void main(String[] args) {
		Date date = new Date(102, 9, 2);
		Date date2 = new Date(102, 9, 2);
		System.out.println(date.equals(date2));
		System.out.println(date.hashCode() + " = " + date2.hashCode());

		Human human = new Human();
		Human human2 = new Human();
		System.out.println(human.equals(human2));

		human.setAge(10);
		human.setBirthday(new Date(93, 8, 2));
		System.out.println(human.getBirthday());
		human.setMoney(10.0f);
		human.setName("qcm");
		human.setSex(true);
		System.out.println("new hashcode is " + human.hashCode());
		human2.setAge(10);
		human2.setBirthday(new Date(93, 8, 2));
		human2.setMoney(10.0f);
		human2.setName("qcm");
		human2.setSex(true);
		System.out.println("new hashcode of human 2 is " + human2.hashCode());
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Human))
			return false;

		Human temp = (Human) o;
		System.out.println(temp.name);
		System.out.println(temp.age);
		System.out.println(temp.birthday);
		if (temp.name.equals(this.name) && (temp.age == this.age)
				&& (temp.birthday.equals(this.birthday))
				&& (this.sex == temp.sex) && (this.money == temp.money))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 31 + this.name.hashCode();
		result = result * 31 + this.age;
		result = result * 31 + this.birthday.hashCode();
		result = result * 31 + (this.sex ? 1 : 0);
		result = result * 31 + Float.floatToIntBits(this.money);
		return result;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
	
	public static class Builder {
		private String name = "";
		private int age = 0;
		private Date birthday = INITIAL_DATE;
		private boolean sex = true; // true = male;
		private float money = 0;

		public Builder() {

		};
	}
}

