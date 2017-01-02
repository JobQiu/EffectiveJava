package com.qcm.learnEffectiveJava.item_30;
/**
 * 
 * @author Congmin Qiu 
 */
public enum PayrollDay2 {
	MONDAY, SATURDAY;

	private enum PayType {
		WEEKDAY {
			@Override
			double overtimePay(double hrs, double payRate) {
				/** */
				return 0;
			}

		},
		WEEKEND {
			@Override
			double overtimePay(double hrs, double payRate) {
				/** */
				return 0;
			}
		};

		// 基本时长, only for weekdays.
		private static final int HOURS_PER_SHIFT = 8;

		abstract double overtimePay(double hrs, double payRate);

		double pay(double hoursWorked, double payRate) {
			double basePay = hoursWorked * payRate;
			return basePay + overtimePay(hoursWorked, payRate);
		}
	}
}
