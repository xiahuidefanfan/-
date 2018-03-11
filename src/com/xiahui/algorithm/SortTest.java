package com.xiahui.algorithm;

import org.junit.Test;

/**
 * ���������

 * @author hp
 *
 */
public class SortTest {
	
	/**
	 * ѡ���������
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
	 * �����������
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
