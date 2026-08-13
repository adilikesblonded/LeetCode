class Solution {
    public int findKthLargest(int[] nums, int k) {
        // use a priority queue implemented using a max heap
        // a max heap is a complete binary tree where the parent >= child (filled left -> right)
        // heaps are stored as arrays. parent = (i-1)/2  (i != 0), left = 2i+1, right = 2i+2
        // deletion => heapify down (remove root add last leaf and compare and switch to maintain heap property)
        // insertion => heapify up (add to the leaf then compare elements and swap)

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // by default a minHeap
         
        // Maintain a minHeap (parent <= children) of size k
        int count=0;
        for(int ele:nums){
            if(count<k){
                minHeap.add(ele);
                count++;
            }
            else if(ele > minHeap.peek()){ //since the minHeap's highest priority element is the smallest element, and we are maintaining a minHeap of size k, peek returns the kth largest element or the kth smallest element from the end
                
                minHeap.poll(); //removes the highest priority element
                minHeap.add(ele);
            }
        }
        return minHeap.peek();
    }
}