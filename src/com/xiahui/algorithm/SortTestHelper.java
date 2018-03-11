package com.xiahui.algorithm;

import java.util.Random;

/**
 * 排序工具类
 * @author xiahui
 *
 */
public class SortTestHelper{
	
	/**
	 * 获取随机指定范围内的Integer数组
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
	 */
	public static <T extends Comparable<T>> void testSort(SortInterface sortImpl,T[] arr, int l, int r) {
		System.out.println("测试开始");
		long beginTime = System.currentTimeMillis();
		sortImpl.sort(arr, l, r);
		long endTime = System.currentTimeMillis();
		System.out.println("测试结束");
		assert(isSorted(arr,l, r));
		System.out.println("测试耗时：" + (endTime - beginTime));
	}
	
	/**
	 * 判断指定数组是否是有序的
	 */
	public static <T extends Comparable<T>> boolean isSorted(T[] arr, int l, int r) {
		for(int i = l; i < r -1; i++) {
			if(arr[i].compareTo(arr[i+1]) > 0 ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 交换数组中两个指定下标值的位置
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
