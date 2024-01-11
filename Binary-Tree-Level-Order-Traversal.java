// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val = val; 
    }
}

class Solution
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = que.remove();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                list.add(node.val);
            }
            ans.add(list);
        }
        return ans;
    }
}