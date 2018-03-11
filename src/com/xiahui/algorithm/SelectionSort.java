package com.xiahui.algorithm;

/**
 * 选择排序实现类
 * 算法复杂度为O(n2)
 * @author xiahui
 *
 */
public class SelectionSort implements SortInterface{
	
	/**
	 * 选择排序的核心是找最小
	 */
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		for( int i = l; i < r; i++ ) {
			
			int minIndex = i;
			/**
			 * 通过每一轮遍历，将值最小的值得下表找到，并赋值给minIndex
			 */
			for (int j = i+1; j < r; j++) {
				if( arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			
			/**
			 * 找到最小值所在下标后，将他的值与当前队首的值做个交换
			 */
			T tempMin = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tempMin;
		}
		
	}

}
