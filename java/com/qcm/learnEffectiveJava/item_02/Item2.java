package com.qcm.learnEffectiveJava.item_02;

/**
 * 
 * @author Congmin Qiu
 */
public class Item2 {


	// required
	private String account;
	private String password;

	// optional
	private int age;
	private String realname;
	private String email;

	// inner class builder
	public static class Builder {
		// required
		private String account;
		private String password;

		// optional
		private int age;
		private String realname;
		private String email;

		public Builder(String account, String password) {
			this.account = account;
			this.password = password;
		}

		public Builder age(int val) {
			age = val;
			return this;
		}

		public Builder realname(String val) {
			realname = val;
			return this;
		}

		public Builder email(String val) {
			email = val;
			return this;
		}

		public Item2 build() {
			return new Item2(this);
		}
	}

	public Item2(Builder builder) {
		this.account = builder.account;
		this.password = builder.password;
		this.realname = builder.realname;
		this.age = builder.age;
		this.email = builder.email;

	}

}
