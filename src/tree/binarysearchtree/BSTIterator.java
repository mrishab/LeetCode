package tree.binarysearchtree;

import java.util.Stack;

import node.TreeNode;

/*
 * Must be O(1) compute
 * Must be O(h) memory
 */
public class BSTIterator {
	private Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		this.storeAllLeft(root);
	}

	private void storeAllLeft(TreeNode root) {
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	/**
	 * @return whether we have a next smallest number
	 */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		if (!hasNext()) {
			return 0;
		}
		TreeNode current = stack.pop();
		if (current.right != null) {
			this.storeAllLeft(current.right);
		}
		return current.val;
	}

}

/**
 * Your BSTIterator will be called like this: BSTIterator i = new
 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
 */