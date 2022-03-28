package a.arrays;

import java.util.Arrays;

public class Demo5 {

	/*
	 * create an array of 50 random names and print all names
	 * */
	public static void main(String[] args) {
		
		String[] names = new String[50];
		for (int i = 0; i < names.length; i++) {
			names[i] = getRandomName();
		}
		
		System.out.println(Arrays.toString(names));
	}

	public static String getRandomName() {
		String[] names = { "Dan", "Ronen", "Ann", "Chen", "David", "Eithan", "Ron", "Tom" };
		int index = (int) (Math.random() * names.length);
		String name = names[index];
		return name;
	}

}
