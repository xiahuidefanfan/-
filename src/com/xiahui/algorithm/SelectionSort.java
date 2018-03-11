package com.xiahui.algorithm;

/**
 * ѡ������ʵ����
 * �㷨���Ӷ�ΪO(n2)
 * @author xiahui
 *
 */
public class SelectionSort implements SortInterface{
	
	/**
	 * ѡ������ĺ���������С
	 */
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		for( int i = l; i < r; i++ ) {
			
			int minIndex = i;
			/**
			 * ͨ��ÿһ�ֱ�������ֵ��С��ֵ���±��ҵ�������ֵ��minIndex
			 */
			for (int j = i+1; j < r; j++) {
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

}
