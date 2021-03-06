package com.algorithms.ctci;

public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
	}
	
	public TreeNode addNode(int value) {
		if (value <= this.value) {
			if (this.left != null) {
				this.left.addNode(value);
			} else {
				this.left = new TreeNode(value);
			}
		} else {
			if (this.right != null) {
				this.right.addNode(value);
			} else {
				this.right = new TreeNode(value);
			}
		}
		return this;
	}
	
	public TreeNode addNode(TreeNode node) {
		if (node.value <= this.value) {
			if (this.left != null) {
				this.left.addNode(node);
			} else {
				this.left = node;
			}
		} else {
			if (this.right != null) {
				this.right.addNode(node);
			} else {
				this.right = node;
			}
		}
		return this;
	}
	
	public void printPreOrder() {
		preOrderTraversal(this);
	}
	
	private void preOrderTraversal(TreeNode node) {
		if (node == null) return;
		System.out.print(node.value + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	
	public void printInOrder() {
		inOrderTraversal(this);
	}
	
	private void inOrderTraversal(TreeNode node) {
		if (node == null) return;
		inOrderTraversal(node.left);
		System.out.print(node.value + " ");
		inOrderTraversal(node.right);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}
