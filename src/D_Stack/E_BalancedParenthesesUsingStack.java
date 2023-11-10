package D_Stack;


public class E_BalancedParenthesesUsingStack {
	private Node top;

	private static class Node {
		char data;
		Node previous;

		Node(char d) {
			this.data = d;
			this.previous = null;
		}

	}

	private void push(char ch) {
		Node newNode = new Node(ch);
		newNode.previous = top;
		top = newNode;
	}

	private char pop() {
		if (top == null)
			throw new RuntimeException("stack empty");
		Node temp = top;
		top = top.previous;
		return temp.data;

	}

	public static void main(String[] args) {
		String str = "aaaa";
		boolean balanced = true;
	
		if (str.length() % 2 != 0 || str.length() == 0) {
			balanced = false;
		} else {
			E_BalancedParenthesesUsingStack stack = new E_BalancedParenthesesUsingStack();
			char[] strArr = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				char c = strArr[i];
				if (c == '(' || c == '{' || c == '[') {
					stack.push(c);
				} else if (stack.top == null) {
					balanced = false;
				} else {
					char charStack = stack.pop();
					if ((c == '}' && charStack != '{') || (c == ')' && charStack != '(')
							|| (c == ']' && charStack != '[')) {
						balanced = false;
					}
				}
			}
		}
		System.out.println(balanced);

	}
}
