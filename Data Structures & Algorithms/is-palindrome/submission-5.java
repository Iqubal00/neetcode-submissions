class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String str1 = str.replaceAll("[^0-9a-zA-Z]", "");
        if(str1.length() ==1) return true;

        for(int i=0; i<str1.length()/2; i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
