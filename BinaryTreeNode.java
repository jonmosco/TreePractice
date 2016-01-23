class BinaryTreeNode<T> {
	
	private T data;

	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}

	public void setLeftChild(BinaryTreeNode<T> node) {
		this.left = node;
	}

	public BinaryTreeNode<T> getLeftChild() {
		return this.left;
	}

	public void setRightChild(BinaryTreeNode<T> node) {
		this.right = node;
	}

	public BinaryTreeNode<T> getRightChild() {
		return this.right;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}
}