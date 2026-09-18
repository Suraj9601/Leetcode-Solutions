class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toLowerCase().toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
}