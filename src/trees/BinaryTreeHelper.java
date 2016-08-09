package trees;

/**
 * Created by Vatsal on 09/08/16.
 */

// Helper class to manipulate Simple Binary Trees
public class BinaryTreeHelper {

    public TreeNode root;

    public BinaryTreeHelper(int data) {
        root.data = data;
    }

    public BinaryTreeHelper() {
        root = null;
    }

    // add left of the node
    public void addLeft(TreeNode node, int data) {
        node.left = new TreeNode(data);
    }

    // add right of the node
    public void addRight(TreeNode node, int data) {
        node.right = new TreeNode(data);
    }

}
