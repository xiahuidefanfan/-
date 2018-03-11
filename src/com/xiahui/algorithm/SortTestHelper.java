package com.xiahui.algorithm;

import java.util.Random;

public class SortTestHelper{
	
	/**
	 * ��ȡ���ָ����Χ�ڵ�Integer����
	 * @param n
	 * @param rangL
	 * @param rangR
	 * @return
	 */
	public static Integer[] generateRandomArray(int n, int rangL, int rangR) {
		assert rangL < rangR;
		Integer[] arr = new Integer[n];
		Random random = new Random();
		for(int i = 0; i < n; i++) {
			arr[i] = random.nextInt(rangR -rangL) + rangL;
			
		}
		return arr;
	}
	
	/**
	 * �������������ʱʱ��
	 * @param sortImpl
	 * @param arr
	 * @param n
	 */
	public static <T extends Comparable<T>> void testSort(SortInterface sortImpl,T[] arr, int n ) {
		System.out.println("���Կ�ʼ");
		long beginTime = System.currentTimeMillis();
		sortImpl.sort(arr, n);
		long endTime = System.currentTimeMillis();
		System.out.println("���Խ���");
		assert(isSorted(arr,n));
		System.out.println("���Ժ�ʱ��" + (endTime - beginTime));
	}
	
	/**
	 * �ж�ָ�������Ƿ��������
	 * @param arr
	 * @param n
	 * @return
	 */
	public static <T extends Comparable<T>> boolean isSorted(T[] arr, int n) {
		for(int i = 0; i < n -1; i++) {
			if(arr[i].compareTo(arr[i+1]) > 0 ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ��������������ָ���±�ֵ��λ��
	 * @param args
	 */
	
	public static <T extends Comparable<T>> void changeValue(T[] arr, int index1, int index2) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = generateRandomArray(50,10,200);
		for( int i : arr) {
			System.out.println(i);
		}
	}

}
