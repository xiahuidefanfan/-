package com.xiahui.algorithm;

/**
 * 查入排序实现类
 * 实现原理：从左到右比较相邻两个数的大小，将较小的数向前找到它的合适位置
 * @author xiahui
 *
 */
public class InsertionSort implements SortInterface {

	/**
	 * 插入排序的核心是找位置
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		for(int i = 1; i < n; i++){
			T temp = arr[i];
			int j;
			/**
			 * 如果temp的值比当前数组下标的值小，则把当前下标往后挪一步
			 */
			for( j = i; j > 0 && (arr[j-1].compareTo(temp) > 0); j --) {
				arr[j] = arr[j-1];
			}
			// 否则，即找到合适的插入位置
			arr[j] = temp;
		}
	}
}
