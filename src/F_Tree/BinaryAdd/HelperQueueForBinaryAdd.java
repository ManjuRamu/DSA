package F_Tree.BinaryAdd;

import F_Tree.BinaryAdd.C_BinaryTreeImpl.BinaryNode;

 class HelperQueueForBinaryAdd {
	Node front;
	Node rear;

	private static class Node {
		BinaryNode data;
		Node next;

		Node(BinaryNode data) {
			this.data = data;
		}

	}

	public void addLeafNodeRef(BinaryNode node) {
		Node newNode = new Node(node);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}

	}

	public BinaryNode getShortLeafNode() {
		Node temp = front;
		front = front.next;
		return temp.data;
	}

}
