package com.xiahui.algorithm;

/**
 * ϣ������ʵ����
 * �㷨���Ӷ�ΪO(nlog2n)
 * @author xiahui
 *
 */
public class ShellSort implements SortInterface{

	/**
	 * ϣ������ĺ������ȷ��飬�ٲ�������
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		
		// ��������2  
		for (int gap = n/2; gap > 0; gap /= 2) {
			for(int i = gap; i < n; i++) {
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
