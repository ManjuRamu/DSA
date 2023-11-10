package Algos;

public class E_BalancedParenthesesUsingStackIngoreBetwwen {
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

	private static boolean isBalanced(String str) {
		if (str.length() == 0) {
			return false;
		} else {
			E_BalancedParenthesesUsingStackIngoreBetwwen stack = new E_BalancedParenthesesUsingStackIngoreBetwwen();
			char[] strArr = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				char c = strArr[i];
				if (c == '(' || c == '{' || c == '[') {
					stack.push(c);
				} else if (stack.top == null) {
					return false;
				} else if (c == '}' || c == ']' || c == ')') {
					char charStack = stack.pop();
					if ((c == '}' && charStack != '{') || (c == ')' && charStack != '(')
							|| (c == ']' && charStack != '[')) {
						return false;
					}
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String str = "{aa}a";
		System.out.println(isBalanced(str));

	}
}