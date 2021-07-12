package com.techiebirendra.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		// we can add as many null values as we want in arraylist
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);

		integerList.forEach(i -> {
			System.out.println(i);
		});

	}
}
