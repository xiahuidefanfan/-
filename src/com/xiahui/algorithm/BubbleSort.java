package com.xiahui.algorithm;

/**
 * ð������ʵ����
 * �㷨���Ӷ�ΪO(n2)
 * @author xiahui
 *
 */
public class BubbleSort implements SortInterface {

	/**
	 * ð������ĺ����������ֵ
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
