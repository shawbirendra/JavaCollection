package com.techiebirendra.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		// we can add as many null values as we want in arraylist
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);
		// Adding Some random values using Arrays.asList(-) function
		integerList = Arrays.asList(2, 4, 8, 1, 9, 3, 5, 19, 12, 18);
		// printing
		integerList.forEach(i -> {
			System.out.print(i + " ");
		});

		// sorting using util Class Collections
		// Collections.sort(integerList);
		System.out.println("\n----------SORTED ARRAY----------");
		// integerList.forEach(i -> {
		// System.out.print(i + " ");
		// });
		// custom sorting logic using comparator
		Comparator<Integer> sort = ((x, y) -> {
			if (x > y) {
				return 1;
			} else if (x < y) {
				return -1;
			}
			return 0;
		});
		Collections.sort(integerList, sort);
		// Printing
		integerList.forEach(i -> {
			System.out.print(i + " ");
		});
	}
}
