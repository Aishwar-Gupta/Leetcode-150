// Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. 
// Answers within 10-5 of the actual answer will be accepted. 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution
{
    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) 
        {
            Double sum = 0.0;
            int size = que.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = que.remove();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                sum += node.val;
            }
            ans.add((double)sum/size);    
        }
        return ans;
    }
}


class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}