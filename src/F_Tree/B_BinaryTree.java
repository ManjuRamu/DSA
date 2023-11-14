package F_Tree;

public class B_BinaryTree {
	Node root;

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {

		Node first = new Node(0);
		Node second = new Node(1);
		Node third = new Node(2);
		Node fourth = new Node(3);
		Node fifth = new Node(4);
		Node sixth = new Node(5);
		Node seventh = new Node(6);
		Node eigth = new Node(7);
		Node ninth = new Node(8);
		Node tenth = new Node(9);

		B_BinaryTree binary = new B_BinaryTree();
		binary.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		fourth.left = eigth;
		fourth.right = ninth;
		ninth.left = tenth;
	}

}
