// Given an integer array nums where the elements are sorted in ascending 
// order, convert it to a height-balanced binary search tree.

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
    public TreeNode sortedArrayToBST(int nums[])
    {
        return construct(nums, 0, nums.length-1);
    }

    private TreeNode construct(int arr[], int si, int ei)
    {
        if(si > ei) return null;
        int mid = si + (ei - si)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = construct(arr, si, mid-1);
        node.right = construct(arr, mid+1, ei);
        return node;
    }
}