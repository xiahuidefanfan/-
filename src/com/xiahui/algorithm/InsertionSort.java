package com.xiahui.algorithm;

/**
 * ��������ʵ����
 * ʵ��ԭ�������ұȽ������������Ĵ�С������С������ǰ�ҵ����ĺ���λ��
 * @author xiahui
 *
 */
public class InsertionSort implements SortInterface {

	/**
	 * ��������ĺ�������λ��
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int n) {
		for(int i = 1; i < n; i++){
			T temp = arr[i];
			int j;
			/**
			 * ���temp��ֵ�ȵ�ǰ�����±��ֵС����ѵ�ǰ�±�����Ųһ��
			 */
			for( j = i; j > 0 && (arr[j-1].compareTo(temp) > 0); j --) {
				arr[j] = arr[j-1];
			}
			// ���򣬼��ҵ����ʵĲ���λ��
			arr[j] = temp;
		}
	}
}
