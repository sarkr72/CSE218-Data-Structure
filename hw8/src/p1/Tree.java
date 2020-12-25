package p1;

import java.util.Stack;

//insert remove find treverse big o is (logn)
public class Tree {

	private Node root; 

	public Tree() { 
		root = null; 
	}

	public Node find(int key) { 
		Node current = root; 
		while (current.iData != key) { 

			if (key < current.iData) {

				current = current.leftChild;
			} else {

				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current; 
	} 

	public void insert(int id, String dd) {
		Node newNode = new Node(); 
		newNode.iData = id; 
		newNode.dData = dd;

		if (root == null) { 
			root = newNode;
		} else {
			Node current = root; 
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.leftChild;
					if (current == null) { 
						parent.leftChild = newNode;
						return;
					}
				} 
				else { 
					current = current.rightChild;
					if (current == null) { 
						parent.rightChild = newNode; 
						return;
					}
				} 
			} 
		} 
	} 

	public boolean delete(int key) { 
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) { 
			parent = current;
			if (key < current.iData) { // go left
				isLeftChild = true;
				current = current.leftChild;
			} else { // or go right
				isLeftChild = false;
				current = current.rightChild;
			}

			if (current == null) { 
				return false;
			}
		} 
		
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) { 
				root = null; 
			} else if (isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null; 
			}
		}


		else if (current.rightChild == null) {
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		}
		
		else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} else { 
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
		
			successor.leftChild = current.leftChild;
		} 
		return true;
	}

	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild; 
		while (current != null) { 
			successorParent = successor;
			successor = current;
			current = current.leftChild; 
		}

		if (successor != delNode.rightChild) { 
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}

	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\nPreorder Traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.print("\nInorder Traversal: ");
			inOrder(root);
			break;
		case 3:
			System.out.println("\nPostorder Traversal: ");
			postOrder(root);
			break;
		}
		System.out.println();
	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("--------------------------------------------------");
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("  ");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		}
		System.out.println("---------------------------------------------------");
	}

	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}

	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
}