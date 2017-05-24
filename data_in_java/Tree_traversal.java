package data_in_java;


import java.util.Stack;

import javax.xml.soap.Node;

public class Tree_traversal {
	private static Node node;

	public static void main(String[] args) {
		 	Stack<Node> stack = new Stack<Node>();
		 	int i;
			for (i=1;i<=5;i++){
				if (node != null) {
					stack.push((Node) node);
					node = (Node)  node.getChildNodes();
				}
				else{
					if (!stack.isEmpty()){
						node = stack.pop();
						System.out.print(node + "\t");
						node = (Node) node.getChildNodes();
					}
					
						
				}

			}

		}
	}

