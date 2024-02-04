// Given an integer array nums and an integer k, return the kth largest 
// element in the array.

// Note that it is the kth largest element in the sorted order, not the kth 
// distinct element.

// Can you solve it without sorting?

// import java.util.PriorityQueue;

// class Solution
// {
//     public int findKthLargest(int nums[], int k)
//     {
//         PriorityQueue<Integer> heap = new PriorityQueue<>(k+1);
//         for(int i = 0; i < nums.length; i++)
//         {
//             heap.add(nums[i]);
//             if(heap.size() > k) heap.remove();
//         }
//         return heap.peek();
//     }
// }


// Second Solution - Quick Select

class Solution
{
    public int findKthLargest(int nums[], int k)
    {
        return QuickSelect(nums, 0, nums.length-1, k);
    }

    private int QuickSelect(int arr[], int si, int ei, int k)
    {
        if(si <= ei)
        {
            int pivot = Partition(arr, si, ei);
            if(pivot == arr.length-k) return arr[pivot];
            else if(pivot < arr.length-k) return QuickSelect(arr, pivot+1, ei, k);
            else return QuickSelect(arr, si, pivot-1, k);
        }
        return -1;
    }

    private int Partition(int arr[], int si, int ei)
    {
        int pivot = ei;
        int l = si;
        int r = ei;
        while(l < r)
        {
            while(l <= ei && arr[l] <= arr[pivot]) l++;
            while(r >= si && arr[r] > arr[pivot]) r--;
            if(l < r) swap(arr, l, r);
        }
        swap(arr, r, pivot);
        return r;
    }

    private void swap(int arr[], int idx1, int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}