// Given the root of a binary tree, return the zigzag level order traversal 
// of its nodes' values. (i.e., from left to right, then right to left for 
// the next level and alternate between).

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean dir = true;
        while(!que.isEmpty())
        {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = que.remove();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                if(dir == true) list.add(0, node.val);
                else list.add(node.val);
                // Collections.reverse(list)     can also use to reverse
            }
            dir = !dir;
            ans.add(list);
        }
        return ans;
    }
}