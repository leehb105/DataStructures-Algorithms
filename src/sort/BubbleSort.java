package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = {3, 14, 5, 7, 2, 1};
		System.out.println(Arrays.toString(arr));
		sort.bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	public void bubbleSort(int[] arr) {
		//O(n^2)
		//오른쪽부터 비교해 왼쪽으로 최솟값을 정렬하는방식으로 구현함
		//배열 전체의 크기만큼 반복
		for(int i = 0; i < arr.length; i++) {
			//제일 오른쪽 인덱스 부터 정렬, 맨왼쪽 인덱스는 최소값으로 정렬된 상태이므로 i의 값까지만 정렬한다
			for(int j = arr.length - 1; j > i; j--)
			if(arr[j - 1] > arr[j]) {
				swap(arr, j - 1, j); //위치 swap
			}
		}
	}
	//두 수의 위치를 바꿔주는 메소드
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
