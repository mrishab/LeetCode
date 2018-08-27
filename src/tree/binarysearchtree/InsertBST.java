package tree.binarysearchtree;

import node.TreeNode;

public class InsertBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode current = root;
		TreeNode prev = null;
		while (current != null) {
			prev = current;
			if (val < current.val) {
				current = current.left;
			} else if (val > current.val) {
				current = current.right;
			}
		}

		if (prev == null) {
			current = new TreeNode(val);
		} else if (val < prev.val) {
			prev.left = new TreeNode(val);
		} else if (val > prev.val) {
			prev.right = new TreeNode(val);
		}
		return root;
	}

	// Space Efficient.
	public TreeNode insertIntoBSTEfficiently(TreeNode root, int val) {
		TreeNode current = root;

		while (true) {
			if (current == null) {
				return new TreeNode(val);
			}

			if (val < current.val) {
				if (current.left == null) {
					current.left = new TreeNode(val);
					break;
				} else {
					current = current.left;
					continue;
				}
			}

			if (val > current.val) {
				if (current.right == null) {
					current.right = new TreeNode(val);
					break;
				} else {
					current = current.right;
					continue;
				}
			}
		}
		return root;
	}
}
