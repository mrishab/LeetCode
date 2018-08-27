package tree.binarysearchtree;

import node.TreeNode;

public class SearchBST {
	public TreeNode searchBST(TreeNode root, int val) {
		while (root != null) {
			if (val == root.val) {
				return root;
			} else if (val < root.val) {
				root = root.left;
			} else if (val > root.val) {
				root = root.right;
			}
		}
		return root;
	}
}