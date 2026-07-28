import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        // Take the first half and sort it
        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);

        String left = new String(half);
        StringBuilder ans = new StringBuilder();

        ans.append(left);

        // Middle character (only if length is odd)
        if ((n & 1) == 1) {
            ans.append(s.charAt(n / 2));
        }

        // Mirror the left half
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}