package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		InsertSort sort = new InsertSort();
		int[] arr = {3, 14, 5, 7, 2, 1};
		System.out.println(Arrays.toString(arr));
		sort.insertSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	public void insertSort(int[] arr) {
		//O(n^2)
		//우측의 미탐색 영억에서 숫자를 하나 꺼내 왼쪽의 정렬된 위치에 삽입하는 정렬
		for(int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int prev = i - 1;
			// 타겟이 이전 원소보다 크기 전 까지 반복
			while(prev >= 0 && arr[prev] > target) {
				arr[prev + 1] = arr[prev]; //오른쪽 원소를 왼쪽에 저장
 				prev--;
			}
			//탈출조건: 왼쪽 요소들이 타겟값보다 작다는 의미
			arr[prev + 1] = target; //탐색 종료지점에 target대입
		}
	}
}
