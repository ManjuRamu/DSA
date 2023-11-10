package D_Stack;

public class D_ReverseStringUsingStack {
	private Node top;

	private static class Node {
		char data;
		Node previous;

		Node(char data) {
			this.data = data;
		}
	}

	public void add(char data) {
		Node newNode = new Node(data);
		newNode.previous = top;
		top = newNode;
	}

	private char pop() {
		if (top == null)
			throw new RuntimeException("stack is empty");
		Node temp = top;
		top = top.previous;
		return temp.data;
	}
public static void main(String[] args) {
	String a = "abcdefghi";
	D_ReverseStringUsingStack stack = new D_ReverseStringUsingStack();
	char[] cr = a.toCharArray();
	for (char c :cr) {
		stack.add(c);
	}
	String res= "";
	for (int i = 0; i < a.length(); i++) {
		res+=stack.pop();
	}
	System.out.println(res);
 }
}
