package com.xiahui.algorithm;

/**
 * ��������ʵ����
 * �㷨���Ӷ�ΪO(n2)
 * @author xiahui
 *
 */
public class InsertionSort implements SortInterface {

	/**
	 * ��������ĺ�������λ��
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		for(int i = l; i < r; i++){
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
