package com.xiahui.algorithm;

import java.util.Random;

public class SortTestHelper{
	
	/**
	 * 获取随机指定范围内的Integer数组
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
	 * 测试排序，输出耗时时间
	 * @param sortImpl
	 * @param arr
	 * @param n
	 */
	public static <T extends Comparable<T>> void testSort(SortInterface sortImpl,T[] arr, int n ) {
		System.out.println("测试开始");
		long beginTime = System.currentTimeMillis();
		sortImpl.sort(arr, n);
		long endTime = System.currentTimeMillis();
		System.out.println("测试结束");
		assert(isSorted(arr,n));
		System.out.println("测试耗时：" + (endTime - beginTime));
	}
	
	/**
	 * 判断指定数组是否是有序的
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
	 * 交换数组中两个指定下标值的位置
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
