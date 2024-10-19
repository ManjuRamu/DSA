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
		queue.addLeafNodeRef(newNode); // left pop
		queue.addLeafNodeRef(newNode); // right pop
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
	private void preOrderTravese(BinaryNode root) {
		   if(root == null) return;
		   System.out.print(root.data +" -> "); 
		   preOrderTravese(root.left);
		   preOrderTravese(root.right);
		  
		}
	private void inOrderTravese(BinaryNode root) {
		   if(root == null) return;
		   inOrderTravese(root.left);
		  
		   System.out.print(root.data +" -> "); 
		   inOrderTravese(root.right);
		  
		}
	private void preOrderTraveseItreator() {
		HelperStackForDisplay stack  = new HelperStackForDisplay();
		stack.push(root);
		while (!stack.isEmpty()) {
			BinaryNode node = stack.pop();
			System.out.println(node.data);
			if(node.left != null) {
				stack.push(node.left);
			}
			if(node.right != null) {
				stack.push(node.right);
			}
			
		}
}

	private void inOrderTraveseIterator() {
		 BinaryNode temp = root;
		 HelperStackForDisplay stack = new HelperStackForDisplay();
		 while (!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp =temp.left;
			}else {
				temp = stack.pop();
				System.out.println(temp.data);
				temp =temp.right;
			}
		}
		 
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
//       binaryTree.preOrderTravese(binaryTree.root);
       binaryTree.inOrderTraveseIterator();
	}

}
