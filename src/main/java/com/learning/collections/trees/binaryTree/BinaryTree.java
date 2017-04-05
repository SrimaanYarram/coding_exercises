package com.learning.collections.trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {
		// Create a new Node and initialize it
		Node newNode = new Node(key, name);

		if (root == null) { 		 // If there is no root this becomes root
			root = newNode;
		} else {
			Node focusNode = root;   // Set root as the Node we will start with as we traverse the tree
			Node parent; 		    // Future parent for our new Node
		
			while (true) {   		// root is the top parent so we start there 
			parent = focusNode; 	// Check if the new node should go on the left side of the parent node
		
			if (key < focusNode.key) {
				focusNode = focusNode.leftChild; 	// Switch focus to the left child
					if (focusNode == null) {		// If the left child has no children
						parent.leftChild = newNode;	// then place the new node on the left of it
						return; 					// All Done
					}

				} else { 									// If we get here put the node on the right
					focusNode = focusNode.rightChild; 		// If the right child has no children
					if (focusNode == null) {				// then place the new node on the right of it
						parent.rightChild = newNode;
						return; 							// All Done
					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {  						// Traverse the left node
			inOrderTraverseTree(focusNode.leftChild); 	// Visit the currently focused on node
			System.out.println(focusNode);  			// Traverse the right node
			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void preorderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public void parentTraverseTree(Node focusNode){
	if(focusNode==null) return;
		Queue<Node> queue=new LinkedList<Node>();  
		queue.add(focusNode);  
	  while(!queue.isEmpty())   {  
		  Node tempNode=queue.poll();  
	   System.out.println (tempNode);  
	   if(tempNode.leftChild!=null)  
	    queue.add(tempNode.leftChild);  
	   if(tempNode.rightChild!=null)  
	    queue.add(tempNode.rightChild);  
	  }  
	}
	
	
	

	public Node findNode(int key) {
		Node focusNode = root;	 // Start at the top of the tree
		// While we haven't found the Node keep looking
		while (focusNode.key != key) {
			if (key < focusNode.key) { // If we should search to the left
				focusNode = focusNode.leftChild; // Shift the focus Node to the left child
			} else {
				focusNode = focusNode.rightChild; 	// Shift the focus Node to the right child
			}
			if (focusNode == null) 	// The node wasn't found
				return null;
		}
		return focusNode;

	}  

public static void main(String[] args) {
	
	

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

		// Different ways to traverse binary trees

		//theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		 //theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75
		
		theTree.parentTraverseTree(theTree.root);


		System.out.println("\nNode with the key 75");

		System.out.println(theTree.findNode(75));

}


}