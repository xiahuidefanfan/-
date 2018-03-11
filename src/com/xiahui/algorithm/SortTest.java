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
	 * 数组排序起始下标（包含）
	 */
	private static final int TEST_BEGIN_INDEX = 0;
	
	/**
	 * 数组排序结束下标（不包含）
	 */
	private static final int TEST_ARRAY_LENGTH = 10;
	
	/**
	 * 选择排序测试
	 */
	@Test
	public void SelectionSortTest() {
		doTest(new SelectionSort());
	}
	
	/**
	 * 插入排序测试
	 */
	@Test
	public void InsertionSortTest() {
		doTest(new InsertionSort());
	}
	
	/**
	 * 冒泡排序测试
	 */
	@Test
	public void BubbleSortTest() {
		doTest(new BubbleSort());
	}
	
	/**
	 * 希尔排序测试
	 */
	@Test
	public void ShellSortTest() {
		doTest(new ShellSort());
	}
	
	/**
	 * 归并排序测试
	 */
	@Test
	public void MergeSortTest() {
		doTest(new MergeSort());
	}
	
	/**
	 * 快速排序测试
	 */
	@Test
	public void QuickSortTest() {
		doTest(new QuickSort());
	}
	
	/**
	 * 测试具体实现方法
	 */
	private void doTest(SortInterface sortImpl) {
		/**
		 * 第一步：随机生成数组
		 */
		Integer[] arr = SortTestHelper.generateRandomArray(ARRAY_LENGTH, ARRAY_VALUE_MIN,ARRAY_VALUE_MAX);
		/**
		 * 第二步：排序
		 */
		SortTestHelper.testSort(sortImpl, arr, TEST_BEGIN_INDEX, TEST_ARRAY_LENGTH);
		
		/**
		 * 查看生成数组信息
		 */
		for (Integer m : arr) {
			System.out.println(m);
		}
	}
}
