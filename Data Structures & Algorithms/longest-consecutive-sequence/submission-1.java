class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> con = new HashMap<>();
        int ans = 0;

        for(int num : nums){
            if(!con.containsKey(num)){
                con.put(num, con.getOrDefault(num - 1, 0) + con.getOrDefault(num + 1,0) + 1);
                con.put(num - con.getOrDefault(num - 1, 0), con.get(num));
                con.put(num + con.getOrDefault(num + 1, 0), con.get(num));
                ans = Math.max(ans, con.get(num));
            }
        }
        return ans;
    }
}
