class Solution {
    public int countDigits(int n) {
        
        if (n == 0) return 1;
        
        // int count = 0;
        
        // while(n > 0) {
        //     n = n / 10;
        //     count++;
        // }
        
        int count = (int) (Math.log10(n) + 1);
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna