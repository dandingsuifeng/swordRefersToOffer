package algorithm;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 */
public class First {

    /**
     * 非递归先根遍历
     * @param root 根节点
     * @return 遍历数组
     */
    public ArrayList<Integer> sort(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node = new TreeNode(0);
        while (!stack.empty()){
            node = stack.pop();
            list.add(node.val);
            if (node.right!=null){
                stack.push(node);
            }
            if (node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }

    public ArrayList<Integer> unSort(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        help(list,root);
        return list;
    }

    private void help(ArrayList<Integer> list, TreeNode node){
        list.add(node.val);
        if (node.left!=null){
            help(list,node.left);
        }
        if (node.right!=null){
            help(list, node.right);
        }
    }
}
