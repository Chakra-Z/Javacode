class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    private static Node root = null;

    // 构建一颗固定的树
    public static Node build() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        D.left = G;
        return A;
    }

    // 先序遍历（根左右）
    public static void prevOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        prevOrder(root.left);
        prevOrder(root.right);
    }

    // 中序遍历（左根右）
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    // 后序遍历（左右根）
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        System.out.print(root.val);
        postOrder(root.right);
    }

    // 求结点个数(遍历改成count++)
//    public static int treeSize = 0;
//    public static void size(Node root) {
//        if (root == null) {
//            return;
//        }
//        treeSize++;
//        size(root.left);
//        size(root.right);
//    }
    // 求结点个数(递归)
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        // 1 + 左子树的结点个数 + 右子树的结点个数
        return 1 + size(root.left) + size(root.right);
    }

    // 求叶子结点个数(遍历)
    // 判断是否是叶子节点++
//    public static int leafSize = 0;
//    public static void getLeafSize(Node root) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            leafSize++;
//        }
//        getLeafSize(root.left);
//        getLeafSize(root.right);
//    }
    // 求叶子结点个数(递归)
    public static int getLeafSize(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        // 左子树叶子结点 + 右子树叶子结点
        return getLeafSize(root.left) + getLeafSize(root.right);
    }

    // 求第 k 层结点个数
    public static int getKLevelSize(Node root, int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        // 求第 k 层结点个数， 求左子树第 k-1 层结点个数 + 右子树第 k-1 层结点个数
        return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right,k - 1);
    }

    public static void main(String[] args){
        root = build();
        //prevOrder(root);
        System.out.println(size(root));
    }

}
