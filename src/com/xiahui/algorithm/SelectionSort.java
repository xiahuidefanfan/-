package com.xiahui.algorithm;

/**
 * ѡ������ʵ����
 * @author xiahui
 *
 */
public class SelectionSort implements SortInterface{
	
	/**
	 * ѡ������ĺ���������С
	 */
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		for( int i = 0; i < n; i++ ) {
			
			int minIndex = i;
			/**
			 * ͨ��ÿһ�ֱ�������ֵ��С��ֵ���±��ҵ�������ֵ��minIndex
			 */
			for (int j = i+1; j < n; j++) {
				if( arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			
			/**
			 * �ҵ���Сֵ�����±�󣬽�����ֵ�뵱ǰ���׵�ֵ��������
			 */
			T tempMin = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tempMin;
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] a = SortTestHelper.generateRandomArray(10, 1, 100);
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(a,10);
		for (Integer m : a) {
			System.out.println(m);
		}
	}

}
