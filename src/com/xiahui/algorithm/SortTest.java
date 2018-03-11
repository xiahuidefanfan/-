package com.xiahui.algorithm;

import org.junit.Test;

/**
 * 排序测试类

 * @author xiahui
 *
 */
public class SortTest {
	/**
	 * 要生成的数组长度
	 * 效率测试时应调整为较大的数
	 */
	private static final int ARRAY_LENGTH= 10;
	
	/**
	 * 要生成的数组的范围的最小指
	 */
	private static final int ARRAY_VALUE_MIN= 0;
	
	/**
	 * 要生成的数组的范围的最大值
	 * 效率测试时应调整为较大的数
	 */
	private static final int ARRAY_VALUE_MAX= 100;
	
	/**
	 * 选择排序测试
	 */
	@Test
	public void SelectionSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new SelectionSort(), arr, ARRAY_VALUE_MAX);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
	/**
	 * 插入排序测试
	 */
	@Test
	public void InsertionSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new InsertionSort(), arr, ARRAY_LENGTH);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
	/**
	 * 冒泡排序测试
	 */
	@Test
	public void BubbleSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new BubbleSort(), arr, ARRAY_LENGTH);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
	/**
	 * 希尔排序测试
	 */
	@Test
	public void ShellSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new ShellSort(), arr, ARRAY_LENGTH);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
	/**
	 * 归并排序测试
	 */
	@Test
	public void MergeSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new MergeSort(), arr, ARRAY_LENGTH);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
	
}
