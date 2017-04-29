package com.learning.problems.stringbased;

public class Flames {
	
	/**
	 * Algorithm : First we are trying to find the index of the first string element in second string,
	 *   Refer code : line 23
	 *         if found then we are trying to remove that particular element from the second String.
	 *   Refer code : line 27  
	 *        else if not found then we are trying to put that particular character in another String, this string will pass all the non founded characters
	 *   Refer code : line 29
	 *         And final we take this String length and then pass it to Switch case 
	 *   Refer code : line 38 
	 *         if the final value is greater than 6 then we are doing a moduls operation.
	 * @param first
	 * @param second
	 * @return
	 */

	public int flames(String first, String second) {
		char[] cFirst = first.toCharArray();
		String rem = "";
		for (char c : cFirst) {
			int index = second.indexOf(c);
			System.out.println("Index -->" + index);
			if (index != -1) {
				System.out.println("1 -->" + second.substring(0, index));
				System.out.println("2 -->" + second.substring(index + 1, second.length()));
				second = second.substring(0, index) + second.substring(index + 1, second.length());
				System.out.println("second -->" + second);
			} else if (index == -1) {

				rem += c;

				System.out.println(rem);
			}

		}
		return (rem + second).length();
	}

	public static void main(String args[]) {
		Flames flam = new Flames();
		int val = flam.flames("srimaan", "srivani");
		System.out.println("Value == " + val);
		if (val > 6) {
			val = val % 6;
		}

		System.out.println(val);

		switch (val) {

		case 0:

			System.out.println("Friends");

			break;
		case 1:

			System.out.println("Friends");

			break;

		case 2:

			System.out.println("Lovers");

			break;

		case 3:

			System.out.println("Affection");

			break;

		case 4:

			System.out.println("Marriage");

			break;

		case 5:

			System.out.println("Enemies");

			break;

		case 6:

			System.out.println("Sibling");

			break;

		default:

			System.out.println("More than 6");
			break;
		}
	}

}
