package com.learning.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CheckInDictionary {

	public static void main(String args[]) {

		String k = "ilikeyouice cream";

		List<String> l = new ArrayList<String>();

		l.add("i");

		l.add("like");

		l.add("you");

		l.add("ice");

		l.add("cream");

		l.add("ice cream");

		Stack s = new Stack();

		for (int i = 0; i < k.length(); i++) {

			for (int j = k.length(); j != i; j--) {

				System.out.println(k.substring(i, j));

				if (l.contains(k.substring(i, j))) {

					if (!s.contains(k.substring(i, j))) {

						s.push(k.substring(i, j));
					}

				}
			}

		}

		System.out.println(s);

	}

}
