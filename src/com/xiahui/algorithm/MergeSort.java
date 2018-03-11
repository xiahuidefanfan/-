package com.xiahui.algorithm;

/**
 * �鲢�㷨ʵ����
 * �㷨���Ӷ�ΪO(N*logN)
 * @author xiahui
 *
 */
public class MergeSort implements SortInterface{

	/**
	 * �鲢�㷨ʵ�ַ���
	 */
	@Override
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r) {
		if(r < 1) {
			return ;
		}
		mergeSort(arr, l, r-1);
	}
	
	/**
	 * �ݹ���ù鲢����
	 * @param arr����Ҫ�����������
	 * @param l�����鿪ʼ�±�
	 * @param r�����������±�
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
	 * �鲢���飬ÿ�ι鲢�Ķ���ͬһ�㼶������������[l,middle]��[middle+1,r]
	 * ���� 3,6,4,9,2,10|8,19,23,44,11,17
	 * @param arr����Ҫ�����������
	 * @param l����������鿪ʼ�±�
	 * @param middle:�������������±�
	 * @param r:�Ҳ�����������±�
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
			 * ��������������ȫ����������ֵ��arr��Ӧ�±���
			 */
			if( i > middle) {
				arr[k] = auxArr[j-l];
				j++;
			}
			/**
			 * ����Ҳ���������ȫ����������ֵ��arr��Ӧ�±���
			 */
			else if( j > r) {
				arr[k] = auxArr[i-l];
				i++;
			}
			/**
			 * �����������鵱ǰ�±�ֵ���Ҳ������鵱ǰ�±�ֵС����ȡ��������鵱ǰ�±�ֵ
			 */
			else if(auxArr[i-l].compareTo(auxArr[j-l]) < 0) {
				arr[k] = auxArr[i-l];
				i++;
			}
			/**
			 * ������ȡ�Ҳ������鵱ǰ�±�ֵ
			 */
			else {
				arr[k] = auxArr[j-l];
				j++;
			}
		}
	}
}
