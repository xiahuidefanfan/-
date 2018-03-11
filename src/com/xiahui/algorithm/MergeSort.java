package com.xiahui.algorithm;

/**
 * 归并算法实现类
 * 算法复杂度为O(N*logN)
 * @author xiahui
 *
 */
public class MergeSort implements SortInterface{

	/**
	 * 归并算法实现方法
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		if(r < 1) {
			return ;
		}
		mergeSort(arr, l, r-1);
	}
	
	/**
	 * 递归调用归并排序
	 * @param arr：将要被排序的数组
	 * @param l：数组开始下标
	 * @param r：数组解结束下标
	 */
	private <T extends Comparable<T>> void mergeSort(T[] arr, int l, int r) {
		if(l == r) {
			return;
		}
		
		int middle = (l+r)/2;
		mergeSort(arr,l,middle);
		mergeSort(arr, middle+1, r);
		if(arr[middle].compareTo(arr[middle+1]) > 0) {
			merge(arr, l, middle, r);
		}
	}

	/**
	 * 归并数组，每次归并的都是同一层级的两个子数组[l,middle]和[middle+1,r]
	 * 例： 3,6,4,9,2,10|8,19,23,44,11,17
	 * @param arr：将要被排序的数组
	 * @param l：左侧子数组开始下标
	 * @param middle:左侧子数组结束下标
	 * @param r:右侧子数组结束下标
	 */
	@SuppressWarnings("unchecked")
	private <T extends Comparable<T>> void merge(T[] arr, int l, int middle, int r) {
		T[] auxArr = (T[]) new Comparable[r-l+1];
		for( int i = l; i <= r; i++) {
			auxArr[i-l] = arr[i];
		}
		
		int i = l;
		int j = middle + 1;
		
		for(int k = l; k <= r; k++) {
			/**
			 * 如果左侧子数组已全被检索并赋值到arr对应下标下
			 */
			if( i > middle) {
				arr[k] = auxArr[j-l];
				j++;
			}
			/**
			 * 如果右侧子数组已全被检索并赋值到arr对应下标下
			 */
			else if( j > r) {
				arr[k] = auxArr[i-l];
				i++;
			}
			/**
			 * 如果左侧子数组当前下标值比右侧子数组当前下标值小，则取左侧子数组当前下标值
			 */
			else if(auxArr[i-l].compareTo(auxArr[j-l]) < 0) {
				arr[k] = auxArr[i-l];
				i++;
			}
			/**
			 * 否则，则取右侧子数组当前下标值
			 */
			else {
				arr[k] = auxArr[j-l];
				j++;
			}
		}
	}
}
