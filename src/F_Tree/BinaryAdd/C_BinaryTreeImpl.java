package F_Tree.BinaryAdd;


public class C_BinaryTreeImpl {
	BinaryNode root;

	 static class BinaryNode {
		int data;
		BinaryNode left;
		BinaryNode right;

		BinaryNode(Integer data) {
			this.data = data;
		}
	}

	void add(int data, HelperQueueForBinaryAdd queue) {
		BinaryNode newNode = new BinaryNode(data);
		queue.addLeafNodeRef(newNode);
		queue.addLeafNodeRef(newNode);
		if (root == null) {
			root = newNode;
		} else {
			BinaryNode leastLeaf = queue.getShortLeafNode();
            if(leastLeaf.left == null) {
            	leastLeaf.left = newNode;
            }
            else {	
            	leastLeaf.right = newNode;
            }
		}
	}
	private void display(BinaryNode root ) {
		   if(root == null) return;
		   System.out.print(root.data +" -> ");
		   display(root.left);
		   display(root.right);
		}
			
	public static void main(String[] args) {
		HelperQueueForBinaryAdd queue = new HelperQueueForBinaryAdd();
       C_BinaryTreeImpl binaryTree = new C_BinaryTreeImpl();
       binaryTree.add(1, queue);
       binaryTree.add(2, queue);
       binaryTree.add(3, queue);
       binaryTree.add(4, queue);
       binaryTree.add(5, queue);
       binaryTree.add(6, queue);
       binaryTree.add(7, queue);
       binaryTree.add(8, queue);
       binaryTree.add(9, queue);
       binaryTree.display(binaryTree.root);
	}

}
