package com.xiahui.algorithm;

import org.junit.Test;

/**
 * ���������

 * @author xiahui
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
	 * ����������ʼ�±꣨������
	 */
	private static final int TEST_BEGIN_INDEX = 0;
	
	/**
	 * ������������±꣨��������
	 */
	private static final int TEST_ARRAY_LENGTH = 10;
	
	/**
	 * ѡ���������
	 */
	@Test
	public void SelectionSortTest() {
		doTest(new SelectionSort());
	}
	
	/**
	 * �����������
	 */
	@Test
	public void InsertionSortTest() {
		doTest(new InsertionSort());
	}
	
	/**
	 * ð���������
	 */
	@Test
	public void BubbleSortTest() {
		doTest(new BubbleSort());
	}
	
	/**
	 * ϣ���������
	 */
	@Test
	public void ShellSortTest() {
		doTest(new ShellSort());
	}
	
	/**
	 * �鲢�������
	 */
	@Test
	public void MergeSortTest() {
		doTest(new MergeSort());
	}
	
	/**
	 * �����������
	 */
	@Test
	public void QuickSortTest() {
		doTest(new QuickSort());
	}
	
	/**
	 * ���Ծ���ʵ�ַ���
	 */
	private void doTest(SortInterface sortImpl) {
		/**
		 * ��һ���������������
		 */
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		/**
		 * �ڶ���������
		 */
		SortTestHelper.testSort(sortImpl, arr, TEST_BEGIN_INDEX, TEST_ARRAY_LENGTH);
		
		/**
		 * �鿴����������Ϣ
		 */
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
}
