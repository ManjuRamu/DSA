package D_Stack;

public class C_StackUsingArrays {
	int top = -1;
	Integer[] arr;

	public C_StackUsingArrays(int size) {
		this.arr = new Integer[size];
	}

	private void push(int data) {
		if (isFull())
			throw new RuntimeException("Stack is full");
		top++;
		arr[top] = data;
	}

	private boolean isFull() {
		return arr.length == top + 1;
	}

	private void display() {
		int temp = top;
		while (temp != -1) {
			System.out.print(arr[temp] + " -> ");
			temp--;
		}
	}

	private void pop() {
		if(top == -1) {
			throw new  RuntimeException("Stack is empty");
		}
		arr[top] = null;
		top--;
	}

	public static void main(String[] args) {
		C_StackUsingArrays stack = new C_StackUsingArrays(5);
		stack.push(10);
		stack.push(20);
		stack.pop();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}
