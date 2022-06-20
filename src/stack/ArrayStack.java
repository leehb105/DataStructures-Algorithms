package stack;

import java.util.Arrays;

public class ArrayStack {

	int top;
	int size;
	int[] stack;
	
	public ArrayStack() {
		
	}
	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("스택이 가득 참");
		} else {
			stack[++top] = item;			
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있음");
		}else {
			stack[top--] = 0;			
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있음");
		}else {
			System.out.println(stack[top]);			
		}
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public boolean isFull() {
		return this.size -1 == top;
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stack));
	}
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.peek();
		stack.push(5);
		stack.peek();
		stack.printStack();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.push(7);
		stack.push(4);
		stack.push(8);
		stack.printStack();
		
	}

}
