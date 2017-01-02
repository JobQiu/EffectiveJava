package com.qcm.learnEffectiveJava.item_30;


/**
 * 
 * @author Congmin Qiu 
 */
public class Item30 {
	public enum Apple {
		fuji(1), pippin(2), vv(3);
		private final int id;

		private Apple(int id) {
			// TODO Auto-generated constructor stub
			this.id = id;
		}

		public int getId() {
			return id;
		}
	}

	public enum Planet {
		MERCURY(3.302e+23, 2.439e6);

		private final double mass;
		private final double redius;

		private Planet(double mass, double redius) {
			// TODO Auto-generated constructor stub
			this.mass = mass;
			this.redius = redius;
			// this.redius = redius;
		}

		public double mass() {
			return this.mass;
		}

		public double redius() {
			return this.redius;
		}
	}

	// 3. a method in an enum class
	public enum Operation {
		PLUS, MINUS, TIMES, DIVIDE;

		double apply(double x, double y) {
			switch (this) {
			case PLUS:
				return x + y;
			case MINUS:
				return x - y;
			case TIMES:
				return x * y;
			case DIVIDE:
				return x / y;
			}
			throw new AssertionError("unknown operation:" + this);
		}

		@Override
		public String toString() {
			return this.name();
		}
	}

	// 4.
	enum PayrollDay {
		Monday, Tuesday, Saturday, Sunday;

		private static final int HOURS_PER_SHIFT = 8;

		double pay(double hoursWorked, double payRate) {
			double basePay = hoursWorked * payRate;

			double overtimePay;
			switch (this) {
			case Saturday:
			case Sunday:
				overtimePay = hoursWorked * payRate / 2;
				// this means when you work 8 hours on weekends, you can get 1.5
				// salary
				break;
			default:// weekdays
				overtimePay = hoursWorked <= HOURS_PER_SHIFT ? 0
						: (hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
				break;
			}
			return overtimePay + basePay;
		}
	}


	public static void main(String[] args) {
		Item30 i = new Item30();

		System.out.println(new Item30.Apple[1].toString());
		for (Apple string : Apple.values()) {
			System.out.println(string.id);
			System.out.println(string.fuji.ordinal());
		}
		for (Planet string : Planet.values()) {
			System.out.println(string.mass + ":" + string.redius);
			
		}

		// 3.
		double x = 14;
		double y = 3;
		for (Operation op : Operation.values()) {
			System.out.println(x + " " + op + " " + y + " equals "
					+ op.apply(x, y));
		}

		// 4.
		System.out
				.println("when you work 8 hours on weekends and every hour you can get 10 dollars,\nyou should get "
						+ PayrollDay.Saturday.pay(8, 10) + " dollars");

	}
}
