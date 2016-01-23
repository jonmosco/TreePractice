import java.io.*;
import java.lang.*;

public class Ex2 {

	public static class Ex {
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static void main(String args[]) {
			
			BinaryTreeNode<Long> n = new BinaryTreeNode(23L); 
			BinaryTreeNode<Long> root = new BinaryTreeNode(23L);
			
			n = new BinaryTreeNode(8L);
			n.setLeftChild(new BinaryTreeNode(56L));
			n.setLeftChild(new BinaryTreeNode(2L));
			root.setLeftChild(n);
			
			n = new BinaryTreeNode(7L);
			n.setLeftChild(new BinaryTreeNode(24L));
			n.setLeftChild(new BinaryTreeNode(3L));
			root.setRightChild(n);

			System.out.println("displaying tree:");
			displayTree(System.out, root);
			System.out.println("");

			System.out.println("sum: " + sumTree(root));
			System.out.println("min: " + minTree(root));
			System.out.println("max: " + maxTree(root));
		}

		public static void displayTree(PrintStream out, BinaryTreeNode<Long> node) {
			
			// pre-order traversal
			/*
			if (node != null) {
				out.println(node.getData());
				displayTree(out, node.getLeftChild());
				displayTree(out, node.getRightChild());
			}
			*/
			
			// in-order traversal
			/*
			if (node != null) {
				displayTree(out, node.getLeftChild());
				out.println(node.getData());
				displayTree(out, node.getRightChild());
			}
			*/
		
			// post-order traversal
			if (node != null) {
				displayTree(out, node.getLeftChild());
				displayTree(out, node.getRightChild());
				out.println(node.getData());
			}
		}

		public static Long sumTree(BinaryTreeNode<Long> node) {
			
			Long sum = new Long(0);
			long longLeftSum = 0;
			long longRightSum = 0;
			long dataNode = 0;
			
			if (node != null) {
				longLeftSum = sumTree(node.getLeftChild());
				longRightSum = sumTree(node.getRightChild());
				dataNode = node.getData();
			}
			
			sum = longRightSum + dataNode + longLeftSum;

			return sum;
		}

		public static Long minTree(BinaryTreeNode<Long> node) {
			Long min = new Long(0);
			return min;
		}

		public static Long maxTree(BinaryTreeNode<Long> node) {
			Long max = new Long(0);
			return max;
		}
	}
}
