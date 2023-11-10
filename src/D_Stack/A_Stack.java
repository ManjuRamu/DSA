package D_Stack;

public class A_Stack {
      Node top;
      private static class Node{
    	  int data;
    	  Node previous;
          public Node(int data) {
           this.data = data;
           this.previous = null;
          }
      }
    
      private void display() {
        Node temp = top;
        while (temp != null) {
		 	System.out.print(temp.data +" -> ");
		      temp =temp.previous;
		}
	}
      
	
	public static void main(String[] args) {
		A_Stack stack = new A_Stack();
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		stack.top = four;
		
		four.previous = three;
		three.previous = two;
		two.previous = one;
		stack.display();
	}
}
