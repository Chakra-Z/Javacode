import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree2 {
    // 二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // 访问根节点.
        // 此处我们的访问指的是把当前节点的值插入到 result 中
        result.add(root.val);
        // 遍历左子树
        result.addAll(preorderTraversal(root.left));
        // 遍历右子树
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    // 二叉树中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // 遍历左子树
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        // 遍历右子树
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    // 二叉树的后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // 遍历左子树
        result.addAll(postorderTraversal(root.left));
        // 遍历右子树
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }

    // 检查两颗树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 1. 如果两棵树都是空树, 这种直接返回 true
        if (p == null && q == null) {
            return true;
        }
        // 2. 如果两棵树一个为空一个不为空, 直接返回 false
        if (p == null || q == null) {
            return false;
        }
        // 3. 如果都不为空树
        //  a) 比较一下根节点的值是否相同. 如果不相同, 就直接返回 false
        if (p.val != q.val) {
            return false;
        }
        //  b) 递归比较左子树和递归比较右子树看看是不是也相同.
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }

    // 另一颗树的子树
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 1. 如果两个树都是空树, 直接是 true
        if (s == null && t == null) {
            return true;
        }
        // 2. 如果两个树一个是空, 一个不是空, 暂且算作不包含. false
        if (s == null || t == null) {
            return false;
        }
        // 3. 如果两个数都非空
        //  a) 比较根节点的值是不是相等, 如果相等的话,
        //     比较一下 s 和 t 是不是相同的树, 如果是相同的树 就认为是包含的.
        boolean ret = false;
        if (s.val == t.val) {
            ret = isSameTree(s, t);
        }
        //  b) 递归的判定一下, t 是否被 s 的左子树包含
        if (!ret) {
            ret = isSubtree(s.left, t);
        }
        //  c) 递归的判定一下, t 是否被 s 的右子树包含
        if (!ret) {
            ret = isSubtree(s.right, t);
        }
        return ret;

//        if (s == null && t == null) {
//            return true;
//        }
//        if (s == null || t == null) {
//            return false;
//        }
//        boolean ret = false;
//        if (s.val == t.val) {
//            ret = isSameTree(s, t);
//        }
//        if (!ret) {
//            ret = isSubtree(s.left,t);
//        }
//        if (!ret) {
//            ret = isSubtree(s.right,t);
//        }
//        return ret;
   }

    // 二叉树最大深
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + ((leftDepth > rightDepth) ? leftDepth : rightDepth);
    }

    // 判断一颗二叉树是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
