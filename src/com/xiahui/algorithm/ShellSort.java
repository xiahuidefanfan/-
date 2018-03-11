package com.xiahui.algorithm;

/**
 * 希尔排序实现类
 * 算法复杂度为O(nlog2n)
 * @author xiahui
 *
 */
public class ShellSort implements SortInterface{

	/**
	 * 希尔排序的核心是先分组，再插入排序
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		
		// 步长除以2  
		for (int gap = r/2; gap > 0; gap /= 2) {
			for(int i = gap; i < r; i++) {
				int j = i;
				T temp = arr[j];
				for(; j >= gap && arr[j-gap].compareTo(temp) > 0 ; j -= gap ) {
					arr[j] = arr[j-gap];
				}
				arr[j] = temp;
			}
		}
		   
	}

}
