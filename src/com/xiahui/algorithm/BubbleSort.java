package com.xiahui.algorithm;

/**
 * 冒泡排序实现类
 * 实现原理：每轮找到最大值，冒泡到数组最后的位置
 * @author xiahui
 *
 */
public class BubbleSort implements SortInterface {

	/**
	 * 冒泡排序的核心是找最大值
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		for(int i = n -1; i > 1; i--) {
			int j = 0;
			for( ; j < i; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					SortTestHelper.changeValue(arr, j, j+1);
				}
			}
		}
	}
}
