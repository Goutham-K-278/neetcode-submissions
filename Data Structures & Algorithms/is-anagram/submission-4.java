class Solution {
    public boolean isAnagram(String s, String t) {
        int str1 = s.length();
        int str2 = t.length();

        if(str1 != str2){
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<str1; i++){
            arr1[s.charAt(i) - 'a']++;
            arr2[t.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
