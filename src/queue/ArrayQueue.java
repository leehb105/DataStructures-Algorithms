package queue;

import java.util.Arrays;

public class ArrayQueue {

	int max;
	int front;
	int rear;
	int num; //현재 데이터 수
	int[] queue;
	
	public ArrayQueue(int capacity) {
		num = front = rear = 0;
		this.max = capacity;
		queue = new int[max];
	}
	public void enque(int item) {
		if(num >= max) {
			System.out.println("큐가 가득참");
		}else {
			queue[rear++] = item;
			num++;			
		}
		if(rear == max) {
			rear = 0;
		}
	}
	public void deque() {
		if(num <= 0) {
			System.out.println("큐가 비어있음");
		}else {
			queue[front++] = 0;
			num--;
		}
		if(front == max) {
			front = 0; //배열 인덱스를 넘지 않게 front를 0으로 보냄
		}
	}
	public void peek() {
		if(num <= 0) {
			System.out.println("큐가 비어있음");
		}else {
			System.out.println(queue[front]);			
		}
	}
	public void printQueue() {
		System.out.println(Arrays.toString(queue));
	}
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		queue.deque();
		queue.printQueue();
		queue.enque(2);
		queue.enque(1);
		queue.printQueue();
		queue.deque();
		queue.printQueue();
		queue.enque(3);
		queue.enque(5);
		queue.enque(7);
		queue.printQueue();
		queue.enque(1);
		queue.printQueue();
		queue.enque(8);
		queue.deque();
		queue.printQueue();
		
	}

}
