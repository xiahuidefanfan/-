package com.xiahui.algorithm;

import org.junit.Test;

/**
 * ���������

 * @author hp
 *
 */
public class SortTest {
	/**
	 * Ҫ���ɵ����鳤��
	 * Ч�ʲ���ʱӦ����Ϊ�ϴ����
	 */
	private static final int ARRAY_LENGTH= 10;
	
	/**
	 * Ҫ���ɵ�����ķ�Χ����Сָ
	 */
	private static final int ARRAY_VALUE_MIN= 0;
	
	/**
	 * Ҫ���ɵ�����ķ�Χ�����ֵ
	 * Ч�ʲ���ʱӦ����Ϊ�ϴ����
	 */
	private static final int ARRAY_VALUE_MAX= 100;
	
	/**
	 * ѡ���������
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
	 * �����������
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
	 * ð���������
	 */
	@Test
	public void BubbleSortTest() {
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		SortTestHelper.testSort(new BubbleSort(), arr, ARRAY_LENGTH);
		for (Integer m : arr) {
			System.out.println(m);
		}
	}

}
