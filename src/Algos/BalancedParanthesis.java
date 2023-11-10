package Algos;

public class BalancedParanthesis {

	static boolean isBalanced(char[] ch) {
		if (ch.length % 2 != 0 || ch.length == 0) {
			return false;
		}
//		int ptr1 = 0;
//		int ptr2 = ch.length - 1;
		for(int ptr1 = 0, ptr2 = ch.length-1; ptr1 < ch.length/2 ; ptr1++, ptr2--) {
			
			if ((ch[ptr1] == '(' && ch[ptr2] == ')') || (ch[ptr1] == '{' && ch[ptr2] == '}')
					|| (ch[ptr1] == '[' && ch[ptr2] == ']')) {
			} else {
				return false;
			}
		}
		
//		while (ptr1 + 1 != ch.length / 2) {
//			if ((ch[ptr1] == '(' && ch[ptr2] == ')') || (ch[ptr1] == '{' && ch[ptr2] == '}')
//					|| (ch[ptr1] == '[' && ch[ptr2] == ']')) {
//				ptr1++;
//				ptr2--;
//			} else {
//				return false;
//			}
//
//		}
		return true;
	}

	public static void main(String[] args) {
		String str = "([{}[)";
		char[] ch = str.toCharArray();
		System.out.println(isBalanced(ch));
	}
}
