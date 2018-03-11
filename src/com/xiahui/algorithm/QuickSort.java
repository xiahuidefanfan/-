package com.xiahui.algorithm;

/**
 * 快速排序实现类
 * 算法复杂度为O(N*logN)
 * @author xiahui
 *
 */
public class QuickSort implements SortInterface{

	/**
	 * 快速排序实现方法
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		quickSort(arr, l, r-1);
	}
	
	/**
	 * 递归实现快速排序
	 */
	private <T extends Comparable<T>> void quickSort(T[] arr, int l, int r) {
		if(l >= r) {
			return;
		}
		
		int v = partition(arr, l, r);
		quickSort(arr, l, v-1);
		quickSort(arr, v+1, r);
	}
	
	/**
	 * 以V为基准，小于v的在arr[l+1,j]中，大于v的在arr[j+1,r]中
	 */
	private <T extends Comparable<T>> int partition(T[] arr, int l, int r) {
		T v = arr[l];
		int j = l;
		for(int i = l + 1; i <= r; i++) {
			if(arr[i].compareTo(v) < 0) {
				SortTestHelper.changeValue(arr, j+1, i);
				j++;
			}
		}
		SortTestHelper.changeValue(arr, l, j);
		return j;
	}

}
