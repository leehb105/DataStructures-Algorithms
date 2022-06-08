package sort;

import java.util.Arrays;


public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = {3, 14, 5, 7, 2, 1};
		System.out.println(Arrays.toString(arr));
		sort.selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	public void selectionSort(int[] arr) {
		//O(n^2)
		//전체 배열에서 최솟값을 찾아 왼쪽에서부터 교환해나가는 정렬
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; //최솟값 인덱스를 저장, 마지막 인덱스는 검색하지 않아도 된다
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j; //최솟값을 찾으면 인덱스 변경
				}
			}
			swap(arr, minIndex, i); //최솟값검색이 끝난후 두 인덱스의 값을 swap
			
		}
	}
	
	//두 수의 위치를 바꿔주는 메소드
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
