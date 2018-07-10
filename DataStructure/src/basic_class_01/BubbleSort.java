package basic_class_01;

import java.awt.print.Printable;

public class BubbleSort {
	public static void bubble(int[] arr){
		if(arr==null&&arr.length<2){
			return;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					swap(arr, i, j);
				}
			}
		}
	}
	public static void swap(int[] arr,int i,int j){
		arr[i]=arr[i]^arr[j];
		arr[j]=arr[i]^arr[j];
		arr[i]=arr[i]^arr[j];
	}
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={21,32,43,98,54,45,23,4,66,86};
		bubble(arr);
		printArray(arr);
	}
}
