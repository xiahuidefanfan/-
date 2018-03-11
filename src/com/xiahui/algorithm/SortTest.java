package com.xiahui.algorithm;

import org.junit.Test;

/**
 * ≈≈–Ú≤‚ ‘¿‡

 * @author hp
 *
 */
public class SortTest {
	
	/**
	 * —°‘Ò≈≈–Ú≤‚ ‘
	 */
	@Test
	public void SelectionSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(10, 0,100);
		SortTestHelper.testSort(new SelectionSort(), arr, 100);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
	/**
	 * ≤Â»Î≈≈–Ú≤‚ ‘
	 */
	@Test
	public void InsertionSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(10, 0,100);
		SortTestHelper.testSort(new InsertionSort(), arr, 10);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}

}
