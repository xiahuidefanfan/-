package com.xiahui.algorithm;

/**
 * �����㷨�ӿ�
 * @author xiahui
 *
 */
public interface SortInterface {
	public <T extends Comparable<T>> void sort(T[] arr, int l, int r);
}
