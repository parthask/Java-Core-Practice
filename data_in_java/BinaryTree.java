package data_in_java;

import java.util.Scanner;

import javax.xml.soap.Node;

//BinaryTree.java 

public class BinaryTree {
	private static Scanner scan= new Scanner(System.in);
	
	// Root node pointer. Will be null for an empty tree. 
		private Node root; 

	/* 
	Creates an empty binary tree -- a null root pointer. 
		 */ 
		
		public void BinaryTree() { 
			root = null; 
		} 
		

	/* 
--Node-- 
The binary tree is built using this nested node class. 
Each node stores one data element, and has left and right 
sub-tree pointer which may be null. 
The node is a "dumb" nested class -- we just use it for 
storage; it does not have any methods. 
	 */
	
	private static class Node {
		
		Node left= null; 
		Node right= null; 
		int data; 
		Node() { 
			int newData=scan.nextInt(); 
			data = newData; 
		}
//		Node(int data) {  
//			left = null; 
//			right =null; 
//		}
		public static void main(String[] args) {
			BinaryTree ob= new BinaryTree();
			Node ob1= new Node();
			
		}
		
	}
	
	/** 
Returns true if the given target is in the binary tree. 
Uses a recursive helper. 
	 */ 
	
	public boolean lookup(int data) { 
		return(lookup(root, data)); 
	} 

	/** 
Recursive lookup  -- given a node, recur 
down searching for the given data. 
	 */
	
	private boolean lookup(Node node, int data) { 
		if (node==null) { 
			return(false); 
		} 
		if (data==node.data) { 
			return(true); 
		} 
		else if (data<node.data) {

			return(lookup(node.left, data)); 
		} 
		else { 
			return(lookup(node.right, data)); 
		} 
	} 

	/** 
Inserts the given data into the binary tree. 
Uses a recursive helper. 
	 */
	
	public void insert(int data) { 
		root = insert(root, data); 
	} 

	/** 
Recursive insert -- given a node pointer, recur down and 
insert the given data into the tree. Returns the new 
node pointer (the standard way to communicate 
a changed pointer back to the caller). 
	 */ 
	
	private Node insert(Node node, int data) { 
		if (node==null) { 
			node = new Node(); 
		} 
		else { 
			if (data <= node.data) { 
				node.left = insert(node.left, data); 
			} 
			else { 
				node.right = insert(node.right, data); 
			} 
		} 
		return(node); // in any case, return the new pointer to the caller 
	}
	
	/** 
	 Build 123 using three pointer variables. 
	 */ 
	public void build123a() { 
		
		root = new Node(); 
		Node lChild = new Node(); 
		Node rChild = new Node(); 
		root.left = lChild; 
		root.right= rChild; 
	} 
	
	public void printTree() { 
		printTree(root); 
		System.out.println(); 
	} 
	
	private void printTree(Node node) { 
		if (node == null) return; 
		// left, node itself, right 
		printTree(node.left); 
		System.out.print(node.data + "  "); 
		printTree(node.right); 
	}

}

