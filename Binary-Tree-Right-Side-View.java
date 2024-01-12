// Given the root of a binary tree, imagine yourself standing on the right side of it, 
// return the values of the nodes you can see ordered from top to bottom.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
}

class Solution
{
    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int size = que.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = que.remove();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                if(i == size-1) list.add(node.val);
            }
        }
        return list;
    }
}