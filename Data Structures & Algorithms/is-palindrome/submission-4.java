class Solution {
    public boolean isPalindrome(String s) {
        int length = 0; 
        int reverse = s.length() - 1;

        while(length < reverse){
            while( length < reverse && !alphaNum(s.charAt(length))){
                length++;
            }
            while(reverse > length && !alphaNum(s.charAt(reverse))){
                reverse--;
            }
            if(Character.toLowerCase(s.charAt(length)) != Character.toLowerCase(s.charAt(reverse))){
                return false;
            }
            length++;
            reverse--;
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}

