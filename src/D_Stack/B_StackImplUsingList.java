package D_Stack;

public class B_StackImplUsingList {
	Node top;

	private static class Node {
		int data;
		Node previous;

		Node(int data) {
			this.data = data;
			this.previous = null;
		}
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.previous = top;
		top = newNode;
	}
	
	private int pop() {
		Node temp = top;
		top = top.previous;
//		temp = null;
		return temp.data;
	}

	private void display() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.previous;
		}
	}

	public static void main(String[] args) {
		B_StackImplUsingList stack = new B_StackImplUsingList();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		System.out.println("popped : "+stack.pop());
		stack.push(5);
		stack.display();
	}

}
