package F_Tree.BinaryAdd;

import F_Tree.BinaryAdd.C_BinaryTreeImpl.BinaryNode;

public class HelperStackForDisplay {
	
	private StackNode top;
	private static class StackNode {
		BinaryNode data;
		StackNode previous;
		
		public StackNode(BinaryNode data2) {
        this.data = data2;
		}
	}
	
	 void push(BinaryNode data) {
        StackNode newNode = new StackNode(data);
        if(top == null) {
        	top = newNode;
        }
        else {
        	newNode.previous = top;
        	top = newNode;
        }
	}
	 boolean isEmpty() {
		 return top == null;
	 }
	   BinaryNode pop() {
         if(top == null) throw new RuntimeException("stack is empty");
         StackNode temp = top;
         top = top.previous;
         return temp.data;
	}

}
