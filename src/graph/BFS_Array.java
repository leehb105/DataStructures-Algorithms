package graph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Array {
	//너비우선탐색, 인접행렬 방식

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //정점개수
		int m = sc.nextInt(); //간선개수
		int v = sc.nextInt(); //탐색 시작 정점 번호

		int[][] array = new int[n + 1][n + 1]; //정점 갯수 + 1의 행렬을 생성해줌, 인덱스0은 제외한다
		boolean[] visited = new boolean[n + 1];

		for(int i = 0; i < m; i++){
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			//양방향인 경우 행렬 양쪽에 지정
			array[v1][v2] = 1;
			array[v2][v1] = 1;
		}
		System.out.println("인접행렬방식");
		bfsArray(v, array, visited);


	}

	//인접행렬로 구현
	public static void bfsArray(int v, int[][] array, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(v);
		visited[v] = true;
		while(!queue.isEmpty()){
			v = queue.poll();
			System.out.println(v + " ");
			for(int i = 1; i <= array.length-1; i++){
				//정점과 방문여부 검사
				if(array[v][i] == 1 && !visited[i]){
					queue.add(i);
					visited[i] = true;
				}
			}
		}


	}
}
