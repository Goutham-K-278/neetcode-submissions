class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int x = num;
                int con = 1;
                while (set.contains(x+1)) {
                    con++;
                    x = x + 1;
                }
                ans = Math.max(ans, con);
            }
        }
        return ans;
    }
}
