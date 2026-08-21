class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(nums[middle] < nums[right]){
                ans = Math.min(ans, nums[middle]);
                right = middle-1;
            }else{
                ans = Math.min(ans, nums[left]);
                left = middle+1;
            }
        }
        return ans;
    }
}
