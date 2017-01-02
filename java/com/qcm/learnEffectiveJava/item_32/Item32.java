package com.qcm.learnEffectiveJava.item_32;

import java.util.EnumSet;
import java.util.Set;

/**
 * 
 * @author Congmin Qiu
 * 
 *         so, if you want to use a collection of enum elements, use enumset
 */
public class Item32 {

	public static String showGroups(Set<Group> groups) {
		StringBuilder result = new StringBuilder();
		for (Group group : groups) {
			result.append(group.name() + " ");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(Item32.showGroups(EnumSet.of(Group.GITLAB,
				Group.JIRA)));
		
	}
}
