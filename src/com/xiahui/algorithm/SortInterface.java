package com.xiahui.algorithm;

public interface SortInterface {
	public <T extends Comparable<T>> void sort(T[] arr, int n);
}
