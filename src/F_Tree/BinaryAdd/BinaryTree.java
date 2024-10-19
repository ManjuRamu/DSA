package F_Tree.BinaryAdd;

import F_Tree.BinaryAdd.BinaryTree.BNode;

class Queue {
	private static final String BinaryTree = null;
	private Node first;
	private Node rear;

	private static class Node {
		private BNode data;
		Node next;

		Node(BNode treenode) {
			this.data = treenode;
		}

	}

	void push(BNode treenode) {
		Node node = new Node(treenode);
		if (this.first == null) {
			this.first = node;
			this.rear = node;
		} else {
			this.rear.next = node;
			this.rear = node;

		}
	}

	BNode pop() {
		if (this.first == null)
			return null;
		Node temp = this.first;
		this.first = this.first.next;
		return temp.data;
	}

}

public class BinaryTree {
	private static final String Interger = null;
	BNode root;
	int d;

	static class BNode {
		private int data;
		private BNode left;
		private BNode right;

		BNode(Integer data) {
			this.data = data;
		}
	}

	void addBin(Integer data, Queue q) {
		BNode newnode = new BNode(data);
		BNode leaf = q.pop();
		if (leaf == null) {
			this.root = newnode;
		} else if (leaf.left == null) {
			leaf.left = newnode;
		} else if (leaf.right == null) {
			leaf.right = newnode;
		}
		q.push(newnode);
		q.push(newnode);
	}

	void traverse(BNode treeNode) {
		if (treeNode == null)
			return;
		traverse(treeNode.left);
		traverse(treeNode.right);
		System.out.print(treeNode.data);
	}

	void levelOrderTraverse() {
		Queue lvq = new Queue();
		lvq.push(this.root);
		BNode temp = lvq.pop();
		while (temp != null) {
			System.out.print(temp.data);
			lvq.push(temp.left);
			lvq.push(temp.right);
			temp = lvq.pop();
		}

	}

	Integer findMax(BNode node) {
		if (node == null)
			return Integer.MIN_VALUE;
		Integer result = node.data;
		Integer left = findMax(node.left);
		Integer right = findMax(node.right);
		if (left > result)
			result = left;
		if (right > result)
			result = right;
		return result;

	}

	public static void main(String[] args) {
		Queue addQ = new Queue();
		BinaryTree t = new BinaryTree();
		t.addBin(1, addQ);
		t.addBin(2, addQ);
		t.addBin(13, addQ);
		t.addBin(4, addQ);
		t.addBin(5, addQ);
		t.addBin(6, addQ);
//		t.traverse(t.root);
//		t.levelOrderTraverse();
		System.out.print(t.findMax(t.root));

	}
}
