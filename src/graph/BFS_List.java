package graph;

import java.util.*;

public class BFS_List {
	//너비우선탐색, 인접리스트 방식

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //정점개수
		int m = sc.nextInt(); //간선개수
		int v = sc.nextInt(); //탐색 시작 정점 번호

		boolean[] visited = new boolean[n + 1];

		LinkedList<Integer>[] list = new LinkedList[n + 1];

		for(int i = 0; i <= n; i++){
			list[i] = new LinkedList<Integer>();
		}

		for(int i = 0; i < m; i++){
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}

		for(int i = 1; i <= n; i++){
			Collections.sort(list[i]); //오름차순 정렬해줌
		}
		System.out.print("인접리스트 방식: ");
		bfsList(v, list, visited);

	}

	//인접행렬로 구현
	public static void bfsList(int v, LinkedList<Integer>[] list, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		visited[v] = true;
		queue.add(v);
		while (queue.size() != 0){
			v = queue.poll();
			System.out.print(v + " ");
			Iterator<Integer> iter = list[v].listIterator();
			while(iter.hasNext()){
				int n = iter.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}


	}
}
