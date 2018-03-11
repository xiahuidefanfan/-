package com.xiahui.algorithm;

/**
 * ð������ʵ����
 * ʵ��ԭ��ÿ���ҵ����ֵ��ð�ݵ���������λ��
 * @author xiahui
 *
 */
public class BubbleSort implements SortInterface {

	/**
	 * ð������ĺ����������ֵ
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		for(int i = n; i > 1; i--) {
			for(int j = 0; j < i && arr[j].compareTo(arr[j+1]) > 0; j++) {
				SortTestHelper.changeValue(arr, j, j+1);
			}
		}
	}
}
