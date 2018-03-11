package com.xiahui.algorithm;

/**
 * ��������ʵ����
 * �㷨���Ӷ�ΪO(N*logN)
 * @author xiahui
 *
 */
public class QuickSort implements SortInterface{

	/**
	 * ��������ʵ�ַ���
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		quickSort(arr, l, r-1);
	}
	
	/**
	 * �ݹ�ʵ�ֿ�������
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
	 * ��VΪ��׼��С��v����arr[l+1,j]�У�����v����arr[j+1,r]��
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
